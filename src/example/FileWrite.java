/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * File: FileWrite.java
 * Author: Dr. Robertson
 * Date: January 1, XXXX
 * Purpose: This program reads
 * ages from a file, copies the data
 * to another file write the average
 * age to another file.
 */
public class FileWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scannerIn = null;
        FileInputStream in = null;
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        PrintWriter fileOut = null;
        // For summary data
        File summaryOut = new File("DataSummary.txt");
        // Use of Scanner and BufferedReader
        int[] ages = new int[100];
        // Counter for age
        int cnt = 0;
        int ageSum = 0;
        try {
            inputStream = new BufferedReader(new FileReader("Ages.txt"));
            // Open Copy Output file

            outputStream = new BufferedWriter(new FileWriter("AgesCopy.txt"));
            scannerIn = new Scanner(inputStream);
            while (scannerIn.hasNext()) {
                ages[cnt] = scannerIn.nextInt();
                // Write to output
                // \r\n provides string content and new line
                outputStream.write(ages[cnt] + "\r\n");
                // Increment ageSum
                ageSum += ages[cnt];
                // Increment counter
                cnt++;
            }
            // Send summary data to
            // output file
            fileOut = new PrintWriter(summaryOut);
            fileOut.print("Average age = "
                    + (ageSum / cnt));

        } catch (IOException io) {
            System.out.println("File IO exception" + io.getMessage());
        } finally {
            // Need another catch for closing 
            // the streams          
            try {
                // Close the streams
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException io) {
                System.out.println("Issue closing the Files" + io.getMessage());
            }
        }
        System.out.println("Files writing application complete.");

    }
}
