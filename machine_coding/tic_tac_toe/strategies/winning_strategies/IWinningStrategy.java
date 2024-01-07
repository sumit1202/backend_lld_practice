package machine_coding.tic_tac_toe.strategies.winning_strategies;

import machine_coding.tic_tac_toe.models.Board;
import machine_coding.tic_tac_toe.models.Player;

public interface IWinningStrategy {
    boolean checkWinner(Player player, Board board);
}
