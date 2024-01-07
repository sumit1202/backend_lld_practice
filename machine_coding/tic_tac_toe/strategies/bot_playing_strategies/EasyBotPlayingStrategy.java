package machine_coding.tic_tac_toe.strategies.bot_playing_strategies;

import java.util.List;

import machine_coding.tic_tac_toe.models.Board;
import machine_coding.tic_tac_toe.models.Cell;
import machine_coding.tic_tac_toe.models.Move;
import machine_coding.tic_tac_toe.models.enums.CellState;

public class EasyBotPlayingStrategy implements IBotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell,null);
                }
            }
        }
        return null;
    }
    
}
