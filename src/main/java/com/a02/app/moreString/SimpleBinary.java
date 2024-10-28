package com.a02.app.moreString;

public class SimpleBinary {
  public static void main() {

    // in binary
    String binaryString = Integer.toBinaryString(5);
    System.out.printf("7 (decimal) = %s (binary)\n", binaryString);
    // with fixed field, pad left with 0s
    String formatted;
    formatted = String.format("7(decimal)=%8s(binary)\n", binaryString).replace(" ", "0");
    System.out.println(formatted);

    // in hex
    String hexString = Integer.toHexString(10);
    System.out.printf("10 (decimal) = %s (hex)\n", 
      hexString);

    // in toString radix
    System.out.printf("9 (decimal) = %s (binary)\n",
        Integer.toString(9, 2));
    System.out.printf("11 (decimal) = %s (hex)\n",
        Integer.toString(11, 16));

  }
}
