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
    // Create a Menu
    Menu sessionMenu = new Menu();
    TimeKeeper sessionTimer = new TimeKeeper();
    // Users Input
    String userResponse;

    Scanner inputScanner = new Scanner(System.in);

    // @todo finish timer class
    System.out.println(sessionTimer.getStartMessage());

    // open and read in the file - USCrime class
    // @todo implement USCrimeData class

    // Hello, user.
    System.out.println(sessionMenu.getHelloMessage());

    // Main program loop.
    do {
      // prompt the user for input
      System.out.println(sessionMenu.getInputPrompt());
      // Loop over selections
      int i = 0;
      String number;
      for (String choice : sessionMenu.getChoicesList()) {
        if (i == 5) {
          number = "Q";
        } else {
          number = Integer.toString(i + 1);
        }
        System.out.println(number + ". " + choice);
        i++;
      }
      userResponse = inputScanner.nextLine();
      // process the user input
      // send results to the user
      System.out.println("You entered: " + userResponse);

    } while (!userResponse.equalsIgnoreCase("quit"));

    // Shutting down
    System.out.println(sessionMenu.getGoodbyeMessage());
    System.out.println(sessionTimer.getUserClockTime());
    System.out.println(sessionTimer.getTimeDuration());
  }
}
