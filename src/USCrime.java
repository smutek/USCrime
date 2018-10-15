import java.util.Arrays;
import java.util.Scanner;

/*
 * File: USCrime.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Provides US Crime Date
 * @todo write purpose for main class
 */
public class USCrime {

  public static void main(String[] args) {

    // @todo use incoming args
    final String FILE_PATH = "/Users/jimmysmutek/Code/school/USCrime/resources/Crime.csv";

    // Try to create a crimeDataObject, based on the supplied file path.
    CrimeDataObject crimeDataObject = new CrimeDataObject(FILE_PATH);

    // Init vars
    Menu sessionMenu = new Menu();
    TimeKeeper sessionTimer = new TimeKeeper();
    String userResponse;
    Scanner inputScanner = new Scanner(System.in);

    // Hello, user.
    System.out.println(sessionTimer.getStartMessage());
    System.out.println(sessionMenu.getHelloMessage());

    // Start Main program loop
    do {
      // prompt the user for input
      System.out.println(sessionMenu.getInputPrompt());
      // Loop over selections

      for (String choice : crimeDataObject.AVAILABLE_OPTIONS)
        System.out.println(choice);

      userResponse = inputScanner.nextLine();
      System.out.println("You entered: " + userResponse + "\n");
      // process the user input & send results to screen
      crimeDataObject.processRequest(userResponse);


    } while (!userResponse.equalsIgnoreCase("q"));

    // Shutting down
    System.out.println(sessionMenu.getGoodbyeMessage());
    System.out.println(sessionTimer.getUserClockTime());
    System.out.println(sessionTimer.getTimeDuration());
  }
}
