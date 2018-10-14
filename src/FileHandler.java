import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * File: FileHandler.java
 * Author: Jimmy Smutek
 * Date: Oct 13, 2018
 * Purpose: Handles file read and validation
 */
class FileHandler {

  public static void main(String[] args) {
    String fileline;
    BufferedReader inputStream = null;
    String filePath = args[0];

    try {
      // Create a BufferedReader
      inputStream = new BufferedReader(new FileReader(filePath));

      //int[] totalRowsAndColumns =

    } catch (IOException io) {
      System.out.println("Error opening file: " + io.getMessage());
    } finally{
      try {
        if(inputStream != null) {
          inputStream.close();
        }
      } catch (IOException io) {
        System.out.println("Problem closing stream: " + io.getMessage());
      }
    }

  }

  int[] countRowsAndColumns(BufferedReader inputStream) {
    return new int[] {21,19};
  }


}
