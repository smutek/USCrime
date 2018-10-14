/*
 * File: CrimeDataObject.java
 * Author: Jimmy Smutek
 * Date: Oct 14, 2018
 * Purpose: Stores and manages interaction with the crimeData array.
 */
class CrimeDataObject {

  private String[][] crimeDataArray;
  private FileHandler fileHandler;
  private String filePath;

  /*
  Right now my job is to create a CDO based on the file path given to me.

  1. Count the trotal rows and columns.
  I was instantiated with the fiel path. So what do I need to dfo to get the total rows and colums?

   */


  CrimeDataObject(String filePath) {

    fileHandler = new FileHandler(filePath);

    // Time to interact with the file handler
    // The file handler just needs to give back an array at this point
    crimeDataArray = this.fileHandler.getCrimeArray(filePath);
  }

  public String[][] getCrimeDataArray() {
    return crimeDataArray;
  }

  //  private String[][] crimeDataArray;
//
//  CrimeDataObject(String[][] crimeDataArray) {
//    this.crimeDataArray = crimeDataArray;
//  }
//
//  String[][] getCrimeDataArray() {
//    return crimeDataArray;
//  }
//
  void printCrimeDataArray(String[][] crimeDataArray) {
    crimeDataArray = this.crimeDataArray;
    String[] arrayRow[];
    String[] arrayColumn;
  }

}
