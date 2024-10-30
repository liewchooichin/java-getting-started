package com.a02.app.bicycle;

public class LocalClassExample {

  // anything not starting with [^0-9],
  // replace with ""
  static String regularExpression = "[^0-9]";

  public static void validatePhoneNumber(String phoneNumber1) {
      // must be final for the local class to use this member.
      final int numberLength = 10;


      // Valid in JDK 8 and later:
      // (never change, effectively final)
      // int numberLength = 10; 

      // This is a local class.
      class PhoneNumber {

          String formattedPhoneNumber = null;

          PhoneNumber(String phoneNumber){
              // numberLength = 7;
              String currentNumber = phoneNumber.replaceAll(
                regularExpression, "");
              if (currentNumber.length() == numberLength)
                  formattedPhoneNumber = currentNumber;
              else
                  formattedPhoneNumber = null;
          }

          public String getNumber() {
              return formattedPhoneNumber;
          }

          // Valid in JDK 8 and later:

//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
      }

      PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
      

      // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

      if (myNumber1.getNumber() == null)
          System.out.println("First number is invalid");
      else
          System.out.println("First number is " + myNumber1.getNumber());
  }

  public static void main() {
      validatePhoneNumber("123-456-7890");
      validatePhoneNumber("456-7890");
      validatePhoneNumber("123-456-7890");
      validatePhoneNumber("A456-7890-123");
  }
}
