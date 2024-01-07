package machine_coding.tic_tac_toe;

import java.util.List;
import java.util.ArrayList;

import machine_coding.tic_tac_toe.controllers.GameController;
import machine_coding.tic_tac_toe.exceptions.InvalidBotCountException;
import machine_coding.tic_tac_toe.models.Bot;
import machine_coding.tic_tac_toe.models.Game;
import machine_coding.tic_tac_toe.models.Player;
import machine_coding.tic_tac_toe.models.Symbol;
import machine_coding.tic_tac_toe.models.enums.BotDifficultyLevel;
import machine_coding.tic_tac_toe.models.enums.GameState;
import machine_coding.tic_tac_toe.models.enums.PlayerType;
import machine_coding.tic_tac_toe.strategies.winning_strategies.ColWinningStrategy;
import machine_coding.tic_tac_toe.strategies.winning_strategies.DiagonalWinningStrategy;
import machine_coding.tic_tac_toe.strategies.winning_strategies.IWinningStrategy;
import machine_coding.tic_tac_toe.strategies.winning_strategies.RowWinningStrategy;

public class Client {
    public static void main(String[] args) throws InvalidBotCountException {

        try {
            GameController gameController = new GameController();

            System.out.println("Game is starting...");

            int dimensionForGame = 3;

            List<Player> playersForGame = new ArrayList<>();
            playersForGame.add(new Player(1, "Bob", PlayerType.HUMAN, new Symbol('X')));
            playersForGame.add(new Bot(2, "Bot", new Symbol('O'), BotDifficultyLevel.EASY));

            List<IWinningStrategy> winningStrategiesForGame = new ArrayList<>();
            winningStrategiesForGame.add(new RowWinningStrategy());
            winningStrategiesForGame.add(new ColWinningStrategy());
            winningStrategiesForGame.add(new DiagonalWinningStrategy());

            Game game = gameController.startGame(dimensionForGame, playersForGame, winningStrategiesForGame);
            System.out.println("Game is running...");
            gameController.displayBoard(game);

            while (gameController.checkGameState(game).equals(GameState.IN_PROGRESS)) {
                gameController.makeMove(game);
                gameController.displayBoard(game);
            }

            if (gameController.checkGameState(game).equals(GameState.DRAW)) {
                System.out.println("Game Draw!");
            } else if (gameController.checkGameState(game).equals(GameState.SUCCESS)) {
                System.out.println("Game Winner: " + gameController.getWinner(game).getName());
            }

        } catch (Exception e) {
            System.out.println("Failed to start game!");
        }

    }
}
