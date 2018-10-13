import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;

/*
 * File: TimeKeeper.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Track elapsed times during program run.
 */
class TimeKeeper {

  private String startMessage;
  private Instant timerStart;

  TimeKeeper() {
  LocalDateTime  timeStarted = LocalDateTime.now();
    timerStart = Instant.now();
    startMessage =
        "Timer started: "
            + timeStarted.getHour()
            + ":"
            + timeStarted.getMinute()
            + ":"
            + timeStarted.getSecond();
  }

  String getTimeDuration() {
    Instant timerStop = Instant.now();
    // @todo format time output
    return "Elapsed time: " + Duration.between(timerStart, timerStop);
  }

  String getStartMessage() {
    return startMessage;
  }
}
