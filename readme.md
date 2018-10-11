# Crime Statistics

This is my final project for CMIS141.

## Requirements

Design a Java application that will read a file containing data related to the US. Crime statistics from 1994-2013. The description of the file is at the end of this file. The application should provide statistical results on the data including:
1. Population growth in percentages from each consecutive year (e.g. 1994-1995 calculation is ((262803276 - 260327021)/260327021)*100 = 0.9512%, 1995-1996 would be ((265228572 - 262803276)/262803276)*100 = 0.9229%)
2. Years where the maximum and minimum Murder rates occurred.
3. Years where the maximum and minimum Robbery rates occurred.
The following are some design criteria and specific requirements that need to be addressed:
    1.  Use command line arguments to send in the name of the US Crime Data file.
    2. You should also use Java classes to their full extent to include multiple methods and at
least two classes
    3. You are not allowed to modify the Crime.csv Statistic data file included in this
assignment.
    4. Use arrays and Java classes to store the data. (Hint: You can and should create a
USCrimeClass to store the fields. You can also have an Array of US Crime Objects.)
    5. You should create separate methods for each of the required functionality. (e.g.
getMaxMurderYear() will return the Year where the Murder rate was highest. )
    6. A user-friendly and well-organized menu should be used for users to select which data
to return. A sample menu is shown in run example. You are free to enhance your design
and you should add additional menu items and functionality.
    7. The menu system should be displayed at the command prompt, and continue to
redisplay after results are returned or until Q is selected. If a user enters an invalid menu item, the system should redisplay the menu with a prompt asking them to enter a valid menu selection
    8. The application should keep track of the elapsed time (in seconds) between once the application starts and when the user quits the program. After the program is exited, the application should provide a prompt thanking the user for trying the US Crime Statistics program and providing the total time elapsed.

Hint: When reading the Crimes file, read one line at a time (See ReadEmail.java) and then within the loop parse each line into the USCrimeClass fields and then store that USCrimeClass Object into an array. Note you can use String.split(“,”) to split the CSV line into a the fields for setting the USCrimeClass Object.

Here is sample run:
```bash
java TestUSCrime Crime.csv
1
********** Welcome to the US Crime Statistical Application ************************** Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: 2
The Murder rate was highest in 1994
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: 5
The Robbery rate was lowest in 2013
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. What were the percentages in population growth for each consecutive year from 1994 – 2013?
2. What year was the Murder rate the highest?
3. What year was the Murder rate the lowest?
4. What year was the Robbery rate the highest?
5. What year was the Robbery rate the lowest?
Q. Quit the program
Enter your selection: Q
Thank you for trying the US Crimes Statistics Program. Elapsed time in seconds was: 32
```

The google recommended Java style guide, provided as link in the week 2 content, should be used to format and document your code. Specifically, the following style guide attributes should be addressed:
- Header comments include filename, author, date and brief purpose of the program.
- In-line comments used to describe major functionality of the code.
- Meaningful variable names and prompts applied.
2

- Class names are written in UpperCamelCase.
- Variable names are written in lowerCamelCase.
- Constant names are in written in All Capitals.
- Braces use K&R style.