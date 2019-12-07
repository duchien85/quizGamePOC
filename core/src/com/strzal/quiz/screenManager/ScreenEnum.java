package com.strzal.quiz.screenManager;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.strzal.gdx.loading.LoadingPaths;
import com.strzal.gdx.screenManager.ScreenEnumInterface;
import com.strzal.gdx.screens.LoadingScreen;
import com.strzal.quiz.QuizGame;
import com.strzal.quiz.screens.MenuTestScreen;

/**
 * Based on http://www.pixnbgames.com/blog/libgdx/how-to-manage-screens-in-libgdx/
 */

public enum ScreenEnum implements ScreenEnumInterface {
//    GAME_SCREEN {
//        public Screen getScreen(Object... params) {
//            return new GameScreen((QuizGame)params[0], (Integer) params[1]);
//        }
//    },
    LOADING_SCREEN {
        public Screen getScreen(Object... params) {
            return new LoadingScreen((QuizGame) params[0], (LoadingPaths)params[1], (ScreenAdapter)params[2]);
        }
    },
    MENU_SCREEN {
        public Screen getScreen(Object... params) {
            return new MenuTestScreen((QuizGame)params[0]);
        }
    }

}
