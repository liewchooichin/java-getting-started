package com.a02.app.hello;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MeasurementValue {
  private double inputValue;
  private String inputUnit;
  // metric
  private double centimeters;
  private double meters;
  private double kilometers;
  // imperial
  private double inches;
  private double feet;
  private double miles;
  // //conversion constants
  private final int CENTIMETERS_PER_METER = 100;
  private final int METERS_PER_KILOMETER = 1000;
  private final int INCHES_PER_FOOT = 12;
  private final int FEET_PER_MILE = 5280;
  private final double METERS_PER_FOOT = 0.3048d;
  // The dFormat object will be an instantiation of the DecimalFormat
  // class, and we will call its constructor to indicate that we want
  // it to limit our doubles to two points of decimal precision.
  private static final DecimalFormat dFormat = new DecimalFormat("0.00");
  private static final DecimalFormat mKmFormat = new DecimalFormat("0.0000");

  // private parse input
  private void parseInput(String input) throws Exception {
    String[] params = input.trim().split(" ");
    inputValue = Double.parseDouble(params[0]);
    inputUnit = params[1];
  }

  // to string
  @Override
  public String toString() {
    dFormat.setRoundingMode(RoundingMode.UP);
    mKmFormat.setRoundingMode(RoundingMode.UP);
    StringBuilder values = new StringBuilder();
    values.append("\ninches = ");
    values.append(dFormat.format(inches));
    values.append("\nfeet = ");
    values.append(dFormat.format(feet));
    values.append("\nmiles = ");
    values.append(mKmFormat.format(miles));
    values.append("\ncentimeters = ");
    values.append(dFormat.format(centimeters));
    values.append("\nmeters = ");
    values.append(dFormat.format(meters));
    values.append("\nkilometers = ");
    values.append(mKmFormat.format(kilometers));
    values.append("\n");
    return values.toString();
  }

  // conversion
  private void convertImperialToMetric() {
    // use feet/meters as our conversion
    meters = feet * METERS_PER_FOOT;
    centimeters = meters * CENTIMETERS_PER_METER;
    kilometers = meters / METERS_PER_KILOMETER;
  }

  private void convertMetricToImperial() {
    // use feet/meters as our conversion
    feet = meters / METERS_PER_FOOT;
    inches = feet * INCHES_PER_FOOT;
    miles = feet / FEET_PER_MILE;
  }

  // choose unit and select conversion to run
  private void runConversions() throws Exception {
    switch (inputUnit) {
      case "in":
        inches = inputValue;
        feet = inches / INCHES_PER_FOOT;
        miles = feet / FEET_PER_MILE;
        convertImperialToMetric();
        break;
      case "ft":
        feet = inputValue;
        inches = feet * INCHES_PER_FOOT;
        miles = feet / FEET_PER_MILE;
        convertImperialToMetric();
        break;
      case "mi":
        miles = inputValue;
        feet = miles * FEET_PER_MILE;
        inches = feet * INCHES_PER_FOOT;
        convertImperialToMetric();
        break;
      case "cm":
        centimeters = inputValue;
        meters = centimeters /
            CENTIMETERS_PER_METER;
        kilometers = meters /
            METERS_PER_KILOMETER;
        convertMetricToImperial();
        break;
      case "m":
        meters = inputValue;
        centimeters = meters *
            CENTIMETERS_PER_METER;
        kilometers = meters /
            METERS_PER_KILOMETER;
        convertMetricToImperial();
        break;
      case "km":
        kilometers = inputValue;
        meters = kilometers *
            METERS_PER_KILOMETER;
        centimeters = meters *
            CENTIMETERS_PER_METER;
        convertMetricToImperial();
        break;
      default:
        throw new InvalidUnitException();
    }
  }

  // Constructor
  public MeasurementValue(String valueStr) throws Exception {
    parseInput(valueStr);
    runConversions();
  }

  public MeasurementValue(double value, String unit) throws Exception {
    inputValue = value;
    inputUnit = unit;
    runConversions();
  }
}
