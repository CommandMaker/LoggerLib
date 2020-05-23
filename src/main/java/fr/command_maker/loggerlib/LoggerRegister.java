package fr.command_maker.loggerlib;

import fr.command_maker.loggerlib.custom.LoggerLevel;
import java.util.Arrays;

public class LoggerRegister {

    public static BasicLogger registerBasicLogger(String name){
        return new BasicLogger(name);
    }

    public static Logger registerLogger(String loggerName){
        return new Logger(loggerName);
    }

    public static void registerCustomLoggerLevel(LoggerLevel... customLevel) {
        Var.customsLevels.addAll(Arrays.asList(customLevel));
    }
}
