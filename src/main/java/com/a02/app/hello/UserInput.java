package com.a02.app.hello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
  public static void main() {
    System.out.println("Enter a number between 31 and 256: ");
    Scanner inputScanner = new Scanner(System.in);
    try{
      int inputInteger = inputScanner.nextInt();
      System.out.printf("The character for ASCII code %d is %c.\n", 
      inputInteger, (char) inputInteger);
    } catch(InputMismatchException exception){
      System.out.println("Only numbers are permitted.");
    } catch (Exception exception){
      System.out.println(exception.getMessage());
    }
    finally{
        inputScanner.close();
      }
  }
}
