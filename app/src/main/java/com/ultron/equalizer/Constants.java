package com.ultron.equalizer;

/**
 * Created by Jazib on 2/11/2018.
 */

public class Constants {
    public interface ACTION {
        String MAIN_ACTION = "com.ultron.equalizer.action.main";
        String STARTFOREGROUND_ACTION = "com.ultron.foregroundservice.action.startforeground";
        String STARTFOREGROUND_ACTION_EQ = "com.ultron.foregroundservice.action.starteq";
        String STARTFOREGROUND_ACTION_BB = "com.ultron.foregroundservice.action.startbb";
        String STARTFOREGROUND_ACTION_VIRTUALIZER = "com.ultron.foregroundservice.action.startvirtualizer";
        String STARTFOREGROUND_ACTION_LOUDNESS = "com.ultron.foregroundservice.action.startloudness";
        String STOPFOREGROUND_ACTION = "com.ultron.foregroundservice.action.stopforeground";
        String STOPFOREGROUND_ACTION_EQ = "com.ultron.foregroundservice.action.stopeq";
        String STOPFOREGROUND_ACTION_BB = "com.ultron.foregroundservice.action.stopbb";
        String STOPFOREGROUND_ACTION_VIRTUALIZER = "com.ultron.foregroundservice.action.stopvirtualizer";
        String STOPFOREGROUND_ACTION_LOUDNESS = "com.ultron.foregroundservice.action.stoploudness";
    }

    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
    }
}