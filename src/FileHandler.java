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

  void readUserFile(String filePath) {
    FileInputStream in = null;
    String fileLine;
    BufferedReader inputStream = null;

    try {
      in = new FileInputStream(filePath);
      inputStream = new BufferedReader(new FileReader(filePath));
      System.out.println("File contents:");
      int totalRows = 0;
      int totalColumns = 0;
      // Count
      while ((fileLine = inputStream.readLine()) != null) {
        totalRows++;
        for (int i = 0; i < fileLine.length(); i++) {
          if (fileLine.charAt(i) == ',') totalColumns++;
        }
      }
      String[][] crimeArray = new String[totalRows][totalColumns];
      int i = 0;
      while ((fileLine = inputStream.readLine()) != null) {
        crimeArray[i] = fileLine.split(",");
      }

      for (String[] crime : crimeArray ) {
        System.out.println(crime[0]);
        System.out.println();
      }

    } catch (IOException io) {
      System.out.println("File IO exception " + io.getMessage());
    } finally {
      try {
        if (in != null) {
          in.close();
        }
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException io) {
        System.out.println("Problem closing the file. " + io.getMessage());
      }
    }
  }
}
