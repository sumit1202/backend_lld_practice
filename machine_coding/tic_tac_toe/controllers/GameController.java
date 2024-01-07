package machine_coding.tic_tac_toe.controllers;

import java.util.List;

import machine_coding.tic_tac_toe.exceptions.InvalidBotCountException;
import machine_coding.tic_tac_toe.models.Game;
import machine_coding.tic_tac_toe.models.Player;
import machine_coding.tic_tac_toe.models.enums.GameState;
import machine_coding.tic_tac_toe.strategies.winning_strategies.IWinningStrategy;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<IWinningStrategy> winningStrategies)
            throws InvalidBotCountException {
        Game game = Game.builder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

        return game;
    }

    public void displayBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameState checkGameState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return null;
    }

    public void undo(Game game) {
    }

}
