/*
 * File: CrimeDataObject.java
 * Author: Jimmy Smutek
 * Date: Oct 14, 2018
 * Purpose: Stores and manages interaction with the crimeData array.
 */
class CrimeDataObject {

  final static String[] AVAILABLE_OPTIONS = {
    "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?",
    "2. What year was the Murder rate the highest?",
    "3. What year was the Murder rate the lowest?",
    "4. What year was the Robbery rate the highest?",
    "5. What year was the Robbery rate the lowest?",
    "Q  Quit the program\n"
  };

  private final int MURDER_RATE_INDEX = 5;
  private final int ROBBERY_RATE_INDEX = 9;

  private String[][] crimeDataArray;

  /**
   * Constructor
   * @param filePath String
   */
  CrimeDataObject(String filePath) {
    FileHandler fileHandler = new FileHandler(filePath);
    crimeDataArray = fileHandler.getCrimeArray(filePath);
  }

  /**
   * Process an incoming request from the user, return the matching response.
   * @param userRequest String
   */
  void processRequest(String userRequest) {
    if (!userRequest.equalsIgnoreCase("q")) {
      switch (userRequest) {
        case "1":
        case "1.":
          getPopulationGrowth();
          break;
        case "2":
        case "2.":
          getHighestMurderRate();
          break;
        case "3":
        case "3,":
          getLowestMurderRate();
          break;
        case "4":
        case "4.":
          getHighestRobberyRate();
          break;
        case "5":
        case "5.":
          getLowestRobberyRate();
          break;
        default:
          System.out.println("Invalid response, please try again.\n");
      }
    }
  }

  /**
   * Calculates the population growth and prints results to the screen.
   */
  private void getPopulationGrowth() {

    String[] growthArray = new String[crimeDataArray.length - 1];

    growthArray[0] = "\nPopulation Growth in Percentages:";
    for (int i = 1; i < growthArray.length; i++) {
      // Years
      String year1 = crimeDataArray[i][0];
      String year2 = crimeDataArray[i + 1][0];
      // Corresponding population Values
      float y1 = Float.parseFloat(crimeDataArray[i][1]);
      float y2 = Float.parseFloat(crimeDataArray[i + 1][1]);
      // population growth = ((y2 - y1)/y1)*100
      double populationGrowth = ((y2 - y1) / y1) * 100;
      // Construct array of results
      growthArray[i] =
          year1
              + "-"
              + year2
              + ": "
              // Round to 4 decimals
              // @see https://stackoverflow.com/a/153753
              + Double.toString(Math.round(populationGrowth * 10000d) / 10000d)
              + "%";
    }
    // output results
    for (String line : growthArray) {
      System.out.println(line);
    }
  }

  /**
   * Get the year of the highest murder rate & print to screen
   */
  private void getHighestMurderRate() {
    String[] highestMurderRate = getHighest(getColumnByIndex(MURDER_RATE_INDEX));
    System.out.println(
        "The highest murder rate occurred in "
            + highestMurderRate[0]
            + ", when it was "
            + highestMurderRate[1]
            + "%.");
  }

  /**
   * Get the year of the lowest murder rate and print to screen
   */
  private void getLowestMurderRate() {
    String[] lowestMurderRate = getLowest(getColumnByIndex(MURDER_RATE_INDEX));
    System.out.println(
        "The lowest murder rate occurred in "
            + lowestMurderRate[0]
            + ", when it was "
            + lowestMurderRate[1]
            + "%.");
  }

  /**
   * Get the year of the highest robbery rate and print to screen
   */
  private void getHighestRobberyRate() {
    String[] highestRobberyRate = getHighest(getColumnByIndex(ROBBERY_RATE_INDEX));
    System.out.println(
        "The highest robbery rate occurred in "
            + highestRobberyRate[0]
            + ", when it was "
            + highestRobberyRate[1]
            + "%.");
  }

  /**
   * Get the year of the lowest robbery rate and print to screen
   */
  private void getLowestRobberyRate() {
    String[] lowestRobberyRate = getLowest(getColumnByIndex(ROBBERY_RATE_INDEX));
    System.out.println(
        "The lowest robbery rate occurred in "
            + lowestRobberyRate[0]
            + ", when it was "
            + lowestRobberyRate[1]
            + "%.");
  }

  /**
   * Utility, gets the highest value from an array passed to it.
   * @param column String[]
   * @return Highest rate and year occurred String[]
   */
  private String[] getHighest(String[] column) {
    String[] highestYearRate = new String[2];
    // Offset start index by one to skip headers
    double highest = Double.parseDouble(column[1]);
    String year = crimeDataArray[1][0];
    for (int i = 2; i < column.length; i++) {
      if (Double.parseDouble(column[i]) > highest) {
        highest = Double.parseDouble(column[i]);
        year = crimeDataArray[i][0];
      }
    }
    highestYearRate[0] = year;
    highestYearRate[1] = Double.toString(highest);
    return highestYearRate;
  }

  /**
   * Utility, gets the lowest value from an array passed to it.
   * @param column String[]
   * @return Lowest rate and year occurred String[]
   */
  private String[] getLowest(String[] column) {
    String[] lowestYearRate = new String[2];
    double lowest = Double.parseDouble(column[1]);
    String year = crimeDataArray[1][0];
    for (int i = 2; i < column.length; i++) {
      if (Double.parseDouble(column[i]) < lowest) {
        lowest = Double.parseDouble(column[i]);
        year = crimeDataArray[i][0];
      }
    }
    lowestYearRate[0] = year;
    lowestYearRate[1] = Double.toString(lowest);
    return lowestYearRate;
  }

  /**
   * Utility method to grab a column from the CrimeData array
   * @param columnIndex Index for the Column to grab
   * @return column String[] the desired column
   */
  private String[] getColumnByIndex(int columnIndex) {
    String column[] = new String[crimeDataArray.length];
    int i = 0;
    for (String[] row : crimeDataArray) {
      column[i] = row[columnIndex];
      i++;
    }
    return column;
  }

}
