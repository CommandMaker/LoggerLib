package fr.command_maker.loggerlib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger extends Var {

    private String name = "";

    public Logger(String loggerName){
        this.name = loggerName;
    }

    public void info(String msg){
        System.out.println(log("INFO", msg));
    }

    public void warn(String msg){
        System.out.println(log("WARN", msg));
    }

    public void error(String msg){
        System.out.println(log("ERROR", msg));
    }

    public void fatal(String msg){
        System.out.println(log("FATAL", msg));
    }

    public void custom(int id, String msg) {
        System.out.println(log(customsLevels.get(id).getLevelName(), msg));
    }

    private String log(String level, String msg){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuilder b = new StringBuilder();
        b.append("[");
        b.append(format.format(new Date()));
        b.append("] ");
        b.append("[");
        b.append(level);
        b.append("] ");
        b.append("[");
        b.append(name);
        b.append("] ");
        b.append(msg);
        return b.toString();
    }
}
