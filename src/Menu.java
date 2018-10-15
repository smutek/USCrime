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
  private String[] choicesList = new String[6];

  Menu() {
    helloMessage = "Hello, User. Welcome to the USCrime Statistical Generator Machine.";
    goodbyeMessage = "Goodbye, User. Thank you for using the system.";

    inputPrompt =
        "Please make your selection by typing a number from the list below.\n"
            + "Type Q at any time to quit.";

    choicesList[0] =
        "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?";
    choicesList[1] = "2. What year was the Murder rate the highest?";
    choicesList[2] = "3. What year was the Murder rate the lowest?";
    choicesList[3] = "4. What year was the Robbery rate the highest?";
    choicesList[4] = "5. What year was the Robbery rate the lowest?";
    choicesList[5] = "Q  Quit the program";
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
