import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class USCrime {

  public static void main(String[] args) {
    // Go!
    String userPrompt = "Please make your selection by typing a letter from the list below.\n"
        + "Type QUIT at any time to exit.";
    String userResponse;
    String[] listChoices = {
        "A. Choice One",
        "B. Choice Another",
        "C. Choice The Third",
        "D. Quit"
    };
    // @todo - probably do not need this
    String[] validOptions = {
        "a", "b", "c", "d"
    };

    Scanner inputScanner = new Scanner(System.in);

    // @todo implement timer class
    System.out.println("Start timer now....");

    // open and read in the file - USCrime class
    // @todo implement USCrime class
    System.out.println("Open and read file now....");
    System.out.println("Create USCrime object now...");

    // welcome the user - menu class(? or main?)
    // @todo implement menu class
    System.out.println("Welcome user!");

    do {
      // Program loop
      // prompt the user for input
      System.out.println(userPrompt);
      for (String choice : listChoices) {
        System.out.println(choice);
      }
      userResponse = inputScanner.nextLine();
      // process the user input

      // send results to the user


      System.out.println("You entered: " + userResponse);

    } while (!userResponse.equalsIgnoreCase("quit"));

    // Shutting down
    System.out.println("Thank you for using this thing.");
    System.out.println("Output elapsed time.");

  }
}
