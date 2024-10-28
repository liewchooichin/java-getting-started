package com.a02.app.moreString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Our program is going to read UTF codes from a file named
 * commandKeyCodes.txt.
 */
public class CharacterArt {
  public static void main(String[] args) {

    try {
      FileReader fileReader = new FileReader("./data/commandKeyCodes.txt");
      BufferedReader reader = new BufferedReader(fileReader);
      // reade the first line
      String dataLine = reader.readLine();
      while (dataLine != null) {
        // read the current line
        String[] data = dataLine.split(",");
        // print the characters
        for (String strNumber : data) {
          int num = Integer.parseInt(strNumber);
          System.out.print((char) num);
        }
        // print a new line
        System.out.println();
        // read the next line from the reader
        dataLine = reader.readLine();
      }
      // close the readers
      reader.close(); // buffer reader
      fileReader.close(); // file reader
    } catch (IOException exception) {
      System.err.println(exception.getMessage());
      System.out.println(exception.getStackTrace());
    }
  }
}
