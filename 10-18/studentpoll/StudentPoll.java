package Elaiza_Exercise;

import java.io.*;
import java.util.*;

public class StudentPoll {

    public static void main(String[] args) {
 
        String inputFilePath = "C:\\Users\\elaiza.ilagan\\eclipse-workspace\\Elaiza_Exercise5\\number.txt";
        String outputFilePath = "C:\\Users\\elaiza.ilagan\\eclipse-workspace\\Elaiza_Exercise5\\output.txt";
        
        try (Scanner scan = new Scanner(System.in);
             Formatter numbersFile = new Formatter(inputFilePath)) {
             
            int surveyRes;

            while (true) {
                System.out.print("Enter survey response from 1-10 (0 to exit): ");
                surveyRes = scan.nextInt();
                
                if (surveyRes <= 0 || surveyRes > 10) {
                    System.out.println("Exiting input loop...");
                    break;
                }

                numbersFile.format("%d%n", surveyRes);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to create input file.");
            e.printStackTrace();
        }

        try (Scanner scan = new Scanner(new File(inputFilePath));
             Formatter outputFile = new Formatter(outputFilePath)) {

            while (scan.hasNextInt()) {
                outputFile.format("%d%n", scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to find input file.");
            e.printStackTrace();
        }
    }
}
