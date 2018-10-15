import java.util.Arrays;
import java.util.Scanner;

/*
 * File: USCrime.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Main Class for USCrime Application
 */
public class USCrime {

  public static void main(String[] args) {

    // Try to create a crimeDataObject, based on the supplied file path.
    CrimeDataObject crimeDataObject = new CrimeDataObject(args[0]);

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
      // Show selections
      for (String choice : crimeDataObject.AVAILABLE_OPTIONS) System.out.println(choice);

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
