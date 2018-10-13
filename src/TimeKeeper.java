/*
 * File: TimeKeeper.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Track elapsed times during program run.
 */
public class TimeKeeper {

  private String startMessage;
  private String stopMessage;

  TimeKeeper() {
    startMessage = "Timer started.";
    stopMessage = "Timer stopped.";
  }

  String getStartMessage() {
    return startMessage;
  }

  String getStopMessage() {
    return stopMessage;
  }
}
