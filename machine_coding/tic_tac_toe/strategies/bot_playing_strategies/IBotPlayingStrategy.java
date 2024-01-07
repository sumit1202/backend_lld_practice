package machine_coding.tic_tac_toe.strategies.bot_playing_strategies;

import machine_coding.tic_tac_toe.models.Board;
import machine_coding.tic_tac_toe.models.Move;

public interface IBotPlayingStrategy {
    Move makeMove(Board board);
}
