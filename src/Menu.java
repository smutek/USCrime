/*
 * File: Menu.java
 * Author: Jimmy Smutek
 * Date: Oct 12, 2018
 * Purpose: This Class provides the menu system for the application.
 */
class Menu {

  private String inputPrompt;
  private String helloMessage;
  private String goodbyeMessage;
  private String[] choicesList;

  Menu() {
    helloMessage = "\nHello, User. Welcome to the USCrime Statistical Generator Machine.";
    goodbyeMessage = "Goodbye, User. Thank you for using the system.";

    inputPrompt =
        "\nPlease make a selection by typing a number from the list below.\n"
            + "Type Q at any time to quit.";

    choicesList = CrimeDataObject.AVAILABLE_OPTIONS;
  }

  String getInputPrompt() {
    return inputPrompt;
  }

  String getHelloMessage() {
    return helloMessage;
  }

  String getGoodbyeMessage() {
    return goodbyeMessage;
  }

  String[] getChoicesList() {
    return choicesList;
  }
}
