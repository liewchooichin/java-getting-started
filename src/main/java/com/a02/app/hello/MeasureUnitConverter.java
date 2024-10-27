package com.a02.app.hello;

import java.util.Scanner;

public class MeasureUnitConverter {
  public static void main() {
    // instructions
    System.out.println("This program converts units of"
        + "measurement (between metric and imperial units).");
    System.out.println("Valid units: (in, ft, mi, cm, m, km");
    System.out.println("Examples: (14 ft, 73 cm, 5 km, etc.)");
    System.out.print("Enter a number with its unit: ");
    // get input
    Scanner inputScanner = new Scanner(System.in);
    String inputStr = inputScanner.nextLine();
    inputScanner.close();
    // check for space as delimiter
    // check for space
    int spacePos = inputStr.indexOf(" ");
    if (spacePos > 0) {
      try {
        MeasurementValue measurement = new MeasurementValue(inputStr);
        System.out.print(measurement.toString());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    } else {
      System.out.println("Check your input; there  should "
          + "be a space between the value and the unit, like 34 cm");
    }
  }
}