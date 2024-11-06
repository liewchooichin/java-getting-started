package com.a02.app.myException;

/**
 * Result of the main():
 * 
 * Question: Which statement write this "File ... has 10 lines"?
 *  
 * File ./data/properties.txt has 10 lines.
    Entering try statement
    Closing PrintWriter
 */


// Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

  private List<Integer> list;
  private static final int SIZE = 10;

  // constructor
  public ListOfNumbers() {
    list = new ArrayList<>(SIZE);
    for (int i = 0; i < SIZE; i++) {
      list.add(i);
    }
  }

  // write list
  public void writeList() {
    // The FileWriter constructor throws IOException, which must be caught.
    // Declare the PrintWriter here if not using try-with-resources.
    //PrintWriter out = null;

    try (PrintWriter out = 
      new PrintWriter(new FileWriter("./data/OutFile.txt"));
    ){
      System.out.println("Entering try statement");

      // Need to write this if we are not using try-with-resources
      //out = new PrintWriter(new FileWriter("./data/OutFile.txt"));

      for (int i = 0; i < SIZE; i++) {
        // The get(int) method throws IndexOutOfBoundsException, which must be caught.
        out.println("Value at: " + i + " = " + list.get(i));
      }
    } catch (IndexOutOfBoundsException exp) {
      System.err.println("Caught IndexOutOfBoundsException: " + exp.getMessage());
    } catch (IOException exp) {
      System.err.println("Caught IOException: " + exp.getMessage());
    } 
    // Need to use finally block if not using try-with-resources
    // finally {
    //   if (out != null) {
    //     System.out.println("Closing PrintWriter");
    //     out.close();
    //   } else {
    //     System.out.println("PrintWriter not open");
    //   }
    // }
  }
  public static void main() {
    ListOfNumbers list = new ListOfNumbers();
    list.writeList();    
  }
}
