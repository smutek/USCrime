import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * File: FileHandler.java
 * Author: Jimmy Smutek
 * Date: Oct 13, 2018
 * Purpose: Handles file read and validation
 */
class FileHandler {

  public static void main(String[] args) {
    String fileLine;
    BufferedReader inputStream = null;
    //String filePath = args[0];
    String filePath = "/Users/jimmysmutek/Code/school/USCrime/resources/Crime.csv";

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
          // we now have num columns 19
        }
        // we now have num rows 21
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
      System.out.println("File Contents:");
      System.out.println(Arrays.deepToString(crimeArray));
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
}
