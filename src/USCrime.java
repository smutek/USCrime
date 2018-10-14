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

    // @todo incoming args
    final String FILE_PATH = "/Users/jimmysmutek/Code/school/USCrime/resources/Crime.csv";

    Menu sessionMenu = new Menu();
    TimeKeeper sessionTimer = new TimeKeeper();
    // @todo this comes uin as a CLI arg
    // Try to create a crime data object
    CrimeDataObject crimeDataObject = new CrimeDataObject(FILE_PATH);
    /*
    Trying to create a crime data object involves:
    Pass the file path to the CDO class.

    CDO constructor will:
      1. Make a CrimeDataObject an d it's methods available.

     */

    // Users Input
    String userResponse;

    Scanner inputScanner = new Scanner(System.in);

    System.out.println(sessionTimer.getStartMessage());

    // open and read in the file - USCrime class
    //dataFile.readUserFile("/Users/jimmysmutek/Code/school/USCrime/resources/Crime.csv");
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
