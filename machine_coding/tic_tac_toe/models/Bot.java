package machine_coding.tic_tac_toe.models;

import machine_coding.tic_tac_toe.models.enums.BotDifficultyLevel;
import machine_coding.tic_tac_toe.models.enums.PlayerType;
import machine_coding.tic_tac_toe.strategies.bot_playing_strategies.BotPlayingStrategyFactory;
import machine_coding.tic_tac_toe.strategies.bot_playing_strategies.EasyBotPlayingStrategy;
import machine_coding.tic_tac_toe.strategies.bot_playing_strategies.IBotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private IBotPlayingStrategy botPlayingStrategy;

    public Bot(int id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, PlayerType.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByLevel(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        Move move = botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }

}
