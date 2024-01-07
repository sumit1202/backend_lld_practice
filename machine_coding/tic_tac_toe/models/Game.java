package machine_coding.tic_tac_toe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import machine_coding.tic_tac_toe.exceptions.InvalidBotCountException;
import machine_coding.tic_tac_toe.models.enums.CellState;
import machine_coding.tic_tac_toe.models.enums.GameState;
import machine_coding.tic_tac_toe.models.enums.PlayerType;
import machine_coding.tic_tac_toe.strategies.winning_strategies.IWinningStrategy;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    private Player winner;
    private List<IWinningStrategy> winningStrategies;

    // constructor
    private Game(int dimension, List<Player> players, List<IWinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
    }

    public static Builder builder() {
        return new Builder();
    }

    // getters and setters
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<IWinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<IWinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void printBoard() {
        this.board.printBoard();
    }

    public boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if (row < 0 || row >= board.getSize()) {
            return false;
        } else if (col < 0 || col >= board.getSize()) {
            return false;
        } else if (!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
            return false;
        } else {
            return true;
        }
    }

    public void makeMove() {
        Player currentMovePlayer = players.get(nextPlayerMoveIndex);
        System.out.println(currentMovePlayer.getName() + "'s turn. Please make a move.");
        Move move = currentMovePlayer.makeMove(board);
        if (!validateMove(move)) {
            System.out.println("Invalid move.");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currentMovePlayer);

        Move finalMove = new Move(cellToBeUpdated, currentMovePlayer);
        moves.add(finalMove);
        nextPlayerMoveIndex++;
        nextPlayerMoveIndex %= players.size();

        if (checkWinner(board, finalMove)) {
            gameState = GameState.SUCCESS;
            winner = currentMovePlayer;
        } else if (moves.size() == board.getSize() * board.getSize()) {
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move move) {
        return false;
    }

    // inner class -> builder design pattern
    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<IWinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<IWinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(IWinningStrategy winningStrategy) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public void validate() throws InvalidBotCountException {

            // validate bot count
            validateBotCount();

            // validate player count
            validatePlayerCount();

            // validate unique symbol for every player
            validateSymbolIfUnique();
        }

        private void validateSymbolIfUnique() {
            Set<Character> set = new HashSet<Character>();
            for (Player player : players) {
                set.add(player.getSymbol().getCharacter());
            }
            if (set.size() != players.size()) {
                throw new RuntimeException("Duplicate symbols are not supported");
            }
        }

        private void validatePlayerCount() {
            if (players.size() != dimension - 1) {
                throw new RuntimeException("Invalid number of players");
            }
        }

        private void validateBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }

            if (botCount > 1) {
                throw new InvalidBotCountException();
            }
        }

        public Game build() throws InvalidBotCountException {
            validate();
            return new Game(this.dimension, this.players, this.winningStrategies);
        }

    }

}
