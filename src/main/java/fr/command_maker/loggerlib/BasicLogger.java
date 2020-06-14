package fr.command_maker.loggerlib;

public class BasicLogger extends Var {

    private String loggerName = "";

    public BasicLogger(String name){
        this.loggerName = name;
    }

    public void info(String msg){
        System.out.println(log("INFO", msg));
    }

    public void warn(String msg){
        System.out.println(log("WARN", msg));
    }

    public void error(String msg) {
        System.out.println(log("ERROR", msg));
    }

    public void fatal(String msg) {
        System.out.println(log("FATAL", msg));
    }

    public void custom(int levelId, String msg) {
      System.out.println(log(customsLevels.get(levelId).getLevelName(), msg));
    }

    private String log(String level, String msg){
        StringBuilder b = new StringBuilder();
        b.append("[");
        b.append(loggerName);
        b.append("] ");
        b.append("[");
        b.append(level);
        b.append("] ");
        b.append(msg);
        return b.toString();
    }
}
