package com.a02.app.moreString;

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class MyDecimalFormat {
  public static void main() {
    DecimalFormat decimalFormat = 
      new DecimalFormat("#,###.##");
      decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
      double dec1 = 2.1;
      double dec2 = 4.2;
      double result = dec1 + dec2;
      
      System.out.printf("%s + %s = %s (round up)\n", 
      decimalFormat.format(dec1),
      decimalFormat.format(dec2),
      decimalFormat.format(result));
  } 
}
