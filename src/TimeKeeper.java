import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/*
 * File: TimeKeeper.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Track elapsed times during program run.
 */
class TimeKeeper {

  private String startMessage;
  private Instant timerStart;
  private DateTimeFormatter clockTime = DateTimeFormatter.ofPattern("h:m:s a");

  /**
   * Default Constructor. Creates an Instant upon instantiation. Method getTimeDuration can then be
   * used to create an additional Instant and measure the duration between it and the initial
   * Instant.
   */
  TimeKeeper() {
    // @todo Remove this or clean it up.
    LocalDateTime timeStarted = LocalDateTime.now();
    DateTimeFormatter todaysDate = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
    // "Start the timer" by creating an Instant
    timerStart = Instant.now();
    startMessage =
        "Today's date is "
            + timeStarted.format(todaysDate)
            + ".\n"
            + "Current time is "
            + timeStarted.format(clockTime);
  }

  /**
   * Returns the time duration, in minutes + seconds between Now (the point at which this method is
   * invoked) and the point at which the object was instantiated.
   *
   * @return String Elapsed time, in seconds, as a string.
   */
  String getTimeDuration() {
    Instant timerStop = Instant.now();
    Duration durationBetween = Duration.between(timerStart, timerStop);
    String timeElapsed;
    long minutes;
    long seconds;
    // If time duration is > 60s, format for minutes.
    if (Duration.between(timerStart, timerStop).toSeconds() > 60) {
      minutes = durationBetween.toMinutes();
      seconds = durationBetween.toMinutes() % 60;
      timeElapsed = minutes + "minutes, " + seconds + " seconds";
    } else {
      timeElapsed = durationBetween.toSeconds() + " seconds";
    }

    return timeElapsed;
  }

  /**
   * Get the users clock time.
   *
   * @return String The users time formatted as a string.
   */
  String getUserClockTime() {
    return "Current time: " + LocalDateTime.now().format(clockTime);
  }

  /**
   * Getter for startMessage
   *
   * @return String
   */
  String getStartMessage() {
    return startMessage;
  }
}
