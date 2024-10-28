package com.a02.app.moreString;

import java.util.function.Function;
import java.util.function.Consumer;

@FunctinalInterface
interface TestEmail{
  abstract boolean test(String email);
}

public class WorkingWithStrings {

  public static TestEmail testValidEmail = (str) -> {
    boolean result = (str.contains(".") && str.contains("@"));
    return result;
  };
  
  public static void main(String[] args) {
    // parse an email: 
    String email = "victoria.ploetz@largecorp.com";
    // need to find out dot . and alt @
    // get the index of the . and @
    int dotPosition = email.indexOf('.');
    int atPosition = email.indexOf('@');
    // use substring to parse the first name
    // from index 0 to first dot
    String firstName = email.substring(0, dotPosition);
    // last name after the first dot up to @ position
    String lastName = email.substring(dotPosition+1, atPosition);
    // company name is after @ to the first dot
    // find the position of the second dot in the remaining string
    String remainingString = email.substring(atPosition+1, email.length()-1);
    int dot2Position = remainingString.indexOf('.');
    String companyName = remainingString.substring(0, dot2Position);
    // Make the names to have capital letter at the first character
    // Lambda function
    Function<String, String> firstLetter = (str) -> {
      char firstChar = Character.toUpperCase(str.charAt(0));
      return (firstChar + str.substring(1));
    };
    // call the transform function of the string instance
    firstName = firstName.transform(firstLetter);
    lastName = lastName.transform(firstLetter);
    companyName = companyName.transform(firstLetter);
    // print the result
    System.out.printf("First name: %s\nLast name: %s\nCompany: %s\n",
      firstName, lastName, companyName);
    // contains method: check if the email contains @ and dot
    String email1 = "little.pony@magical-land.com";
    String email2 = "little-pony-at-magical-land-com";
    // Use a Consumer lambda to print the email result
    Consumer<Boolean> printEmailTestResult = (result) -> 
    {if(result == true){
      System.out.println("The email is valid.");
    } else {
      System.out.println("The email is NOT valid.");
    }};
    printEmailTestResult.accept(testValidEmail.test(email1));
    printEmailTestResult.accept(testValidEmail.test(email2));
  }
}
