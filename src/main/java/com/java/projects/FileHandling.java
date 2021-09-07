package com.java.projects;

import java.io.*;
import java.util.Scanner;

public class FileHandling {


    public static void createFile(String fileName){


        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void readFile(String fileName){

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            System.out.println("Reading Data from : "+fileName);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void writeDataToFile(String fileName,String content){


        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void appendDataToFile(String fileName,String content){

        try {

            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            out.write(content);
            System.out.println("After Appending Data .");
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }

    public static void main(String [] args){

        String fileName  = "TestFile.txt";

     //   createFile(fileName);

     //   writeDataToFile(fileName,"Writing something in File \n");

        readFile(fileName);
        appendDataToFile(fileName,"This is newly added line ");

        readFile(fileName);
    }
}
