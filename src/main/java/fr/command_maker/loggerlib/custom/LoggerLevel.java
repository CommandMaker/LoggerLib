package fr.command_maker.loggerlib.custom;

import fr.command_maker.loggerlib.Var;

public class LoggerLevel {

  private String name = "";
  private LoggerLevel instance;

  public LoggerLevel(String levelName) {
    this.name = levelName;
    this.instance = this;
  }

  public String getLevelName() {
    return name;
  }

  public LoggerLevel getLoggerLevel() {
    return instance;
  }

  public static LoggerLevel getLevelById(int id) {
    return Var.customsLevels.get(id).getLoggerLevel();
  }
}
