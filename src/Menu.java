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
  private String[] choicesList = new String[3];

  Menu() {
    helloMessage = "Hello, User.";
    goodbyeMessage = "Goodbye, User.";

    inputPrompt =
        "Please make your selection by typing a letter from the list below.\n"
            + "Type QUIT at any time to exit.";

    choicesList[0] = "Choice 1";
    choicesList[1] = "Choice 2";
    choicesList[2] = "Choice 3";
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
