package fr.command_maker.loggerlib;

public class LoggerRegister {

    public static BasicLogger registerBasicLogger(String name){
        return new BasicLogger(name);
    }

    public static Logger registerLogger(String loggerName){
        return new Logger(loggerName);
    }
}
