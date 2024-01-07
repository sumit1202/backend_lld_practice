package machine_coding.tic_tac_toe.strategies.bot_playing_strategies;

import machine_coding.tic_tac_toe.models.enums.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static IBotPlayingStrategy getBotPlayingStrategyByLevel(BotDifficultyLevel botDifficultyLevel) {
        // if and else to handle different levels
        return new EasyBotPlayingStrategy();
    }
}
