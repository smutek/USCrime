import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * File: FileHandler.java
 * Author: Jimmy Smutek
 * Date: Oct 13, 2018
 * Purpose: Handles file read and validation. Creates an instance of CrimeDataObject once the file has
 * been successfully read in.
 */
class FileHandler {

  // do 4 things
  // make sure everything is cool
  // count rows and columns
  // create an array
  // give that array back to the calling method

  FileHandler(String filePath) {
    String fileLine;
    BufferedReader inputStream = null;

    try {
      // Create a BufferedReader
      inputStream = new BufferedReader(new FileReader(filePath));
      int totalRows = 0;
      int totalColumns = 0;
      // Let's count the rows and columns.
      // for each loop pass set fileLine to a readLine() that is not null
      while ((fileLine = inputStream.readLine()) != null) {
        // Here is a file line
        // Increment rows
        totalRows++;
        // Now count columns, but only once
        if (totalColumns == 0) {
          // If total columns is 0, this is the header
          // Count the number of commas on this line to get the total columns
          for (int i = 0; i < fileLine.length(); i++) {
            // If this is a comma, increment total columns
            if (fileLine.charAt(i) == ',') totalColumns++;
          }
          // we now have num columns (19)
          final int NUM_COLUMNS = totalColumns;
        }
        // we now have num rows (21)
        final int NUM_ROWS = totalRows;
      }
      // Reset input stream
      inputStream = new BufferedReader(new FileReader(filePath));
      // create crime array
      String[][] crimeArray = new String[totalRows][totalColumns];
      int i = 0;
      // Loop again and fill the array
      while ((fileLine = inputStream.readLine()) != null) {
        crimeArray[i] = fileLine.split(",");
        i++;
      }
      // We now have a crime array
      // Create an instance of CrimeDataObject

      //System.out.println("File Contents:");

    } catch (IOException io) {
      System.out.println("Error opening file: " + io.getMessage());
    } finally {
      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException io) {
        System.out.println("Problem closing stream: " + io.getMessage());
      }
    }
  }

  String[][] getCrimeArray(String filePath) {
    String fileLine;
    BufferedReader inputStream = null;
    CrimeDataObject crimeDataObject;

    try {
      // Create a BufferedReader
      inputStream = new BufferedReader(new FileReader(filePath));
      int totalRows = 0;
      int totalColumns = 0;
      // Let's count the rows and columns.
      // for each loop pass set fileLine to a readLine() that is not null
      while ((fileLine = inputStream.readLine()) != null) {
        // Here is a file line
        // Increment rows
        totalRows++;
        // Now count columns, but only once
        if (totalColumns == 0) {
          // If total columns is 0, this is the header
          // Count the number of commas on this line to get the total columns
          for (int i = 0; i < fileLine.length(); i++) {
            // If this is a comma, increment total columns
            if (fileLine.charAt(i) == ',') totalColumns++;
          }
          // we now have num columns (19)
        }
        // we now have num rows (21)
      }
      // Reset input stream
      inputStream = new BufferedReader(new FileReader(filePath));
      // create crime array
      String[][] crimeDataArray = new String[totalRows][totalColumns];
      int i = 0;
      // Loop again and fill the array
      while ((fileLine = inputStream.readLine()) != null) {
        crimeDataArray[i] = fileLine.split(",");
        i++;
      }
      // We now have a crime array
      return crimeDataArray;
    } catch (IOException io) {
      System.out.println("Error opening file: " + io.getMessage());
    } finally {
      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException io) {
        System.out.println("Problem closing stream: " + io.getMessage());
      }
    }
      return null;
  }

}
