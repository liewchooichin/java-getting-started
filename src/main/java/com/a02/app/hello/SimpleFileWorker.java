package com.a02.app.hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWorker {

  private static void writeData() {
    try {
      FileWriter fileWriter = new FileWriter("gamesCatalog.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      // write header row
      bufferedWriter.write("name, company, year\n");
      // data
      bufferedWriter.write("Pitfall, Activisio, 1982\n");
      bufferedWriter.write("Crackpots, Activision, 1983\n");
      bufferedWriter.write("Yars' Revenge, Atari, 1981\n");
      bufferedWriter.write("Warlords, Atari, 1981\n");
      bufferedWriter.write("Defender, Atari, 1981\n");
      bufferedWriter.write("Adventure, Atari, 1980\n");
      // close the writer
      bufferedWriter.close(); // close buffer first
      fileWriter.close(); // then, close the file
    } catch (IOException writerException) {
      System.out.println("Error occured while writing.");
      System.out.println(writerException.getMessage());
      writerException.printStackTrace();
    }
  }

  private static void readData() {
    try {
      BufferedReader bufferedReader = new BufferedReader(
          new FileReader("gamesCatalog.txt"));
      // read the header row
      String gameLine = bufferedReader.readLine();
      boolean headerRow = true; // first row
      while (gameLine != null) {
        if (headerRow == true) {
          headerRow = false; // content
          System.out.println(gameLine);
        } else {
          // columns: name, company, year
          String[] gameColumns = gameLine.split(",");
          //System.out.printf("column 2: --%s--\n", gameColumns[2].trim());
          int year = Integer.parseInt(gameColumns[2].trim());
          // print game in 1981
          if (year == 1981) {
            System.out.println(gameLine);
          }
        }
        // read the next line (content)
        gameLine = bufferedReader.readLine();
      }
      // close the reader
      bufferedReader.close();
    } catch (IOException readerEx) {
      System.out.println("Error occurred while writing:");
      readerEx.printStackTrace();
    }
  }

  public static void main() {
    writeData();
    readData();
  }
}
