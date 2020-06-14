package fr.command_maker.loggerlib.custom;

import fr.command_maker.loggerlib.Var;

public class LoggerLevel extends Var {

  private String name = "";
  private LoggerLevel instance;

  public LoggerLevel(String levelName) {
    this.name = levelName;
    this.instance = this;
  }

  public LoggerLevel() {}

  public String getLevelName() {
    return name;
  }

  public LoggerLevel getLoggerLevel() {
    return instance;
  }

  public LoggerLevel getLevelById(int id) {
    return customsLevels.get(id).getLoggerLevel();
  }
}
