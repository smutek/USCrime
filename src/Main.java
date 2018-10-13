import java.util.Scanner;

/*
 * File: Main.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: Provides US Crime Date
 * @todo write purpose for main class
 */
public class Main {

  public static void main(String[] args) {
    // Create a Menu
    Menu sessionMenu = new Menu();
    TimeKeeper sessionTimer = new TimeKeeper();
    // Users Input
    String userResponse;

    Scanner inputScanner = new Scanner(System.in);

    // @todo finish timer class
    System.out.println(sessionTimer.getStartMessage());

    // open and read in the file - Main class
    // @todo implement USCrimeData class
    System.out.println("Open and read file now....");
    System.out.println("Create Main object now...");

    // welcome the user - menu class(? or main?)
    // @todo implement menu class
    System.out.println(sessionMenu.getHelloMessage());

    do {
      // prompt the user for input
      System.out.println(sessionMenu.getInputPrompt());
      // Loop over selections
      for (String choice : sessionMenu.getChoicesList()) {
        System.out.println(choice);
      }
      userResponse = inputScanner.nextLine();
      // process the user input

      // send results to the user

      System.out.println("You entered: " + userResponse);

    } while (!userResponse.equalsIgnoreCase("quit"));

    // Shutting down
    System.out.println(sessionTimer.getUserClockTime());
    System.out.println(sessionTimer.getTimeDuration());
    System.out.println(sessionMenu.getGoodbyeMessage());
  }
}
