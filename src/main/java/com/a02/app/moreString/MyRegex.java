package com.a02.app.moreString;

import java.util.regex.Pattern;

import com.a02.app.hello.MeasureUnitConverter;

import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public class MyRegex {

  public static void main(String[] args) {
    // escape sequence for dash - is \\-
    Pattern mobilePattern = Pattern.compile("65\\-[6|8|9]{1}[0-9]{7}");
    // Pattern fixedPattern = Pattern.compile("65\\-[6]{1}[0-9]{7}");
    List<String> phoneNumbers = new ArrayList<>();
    phoneNumbers.add("65-91112111"); // valid mobile
    phoneNumbers.add("65-81112111"); // valid mobile
    phoneNumbers.add("65-61112111"); // valid fixed
    phoneNumbers.add("61-91112111"); // not 65
    phoneNumbers.add("65-9111211121"); // more digits
    phoneNumbers.add("65-9111211"); // less digits
    phoneNumbers.add("65-71112111"); // start with 7

    for (String num : phoneNumbers) {
      Matcher mobileMatcher = mobilePattern.matcher(num);
      boolean found = mobileMatcher.find();
      if (found) {
        System.out.printf("%s is a valid phone number.\n", num);
        String group = mobileMatcher.group();
        int start = mobileMatcher.start();
        int end = mobileMatcher.end();
        System.out.printf("group %s, start %d, end %d\n",
          group, start, end);
      } else {
        System.out.printf("%s is a not valid phone number.\n", num);
      }
    }

    // Another pattern
    // [Vic|]: This part is looking to match either on a string starting
    // with Vic or nothing.
    Pattern victoriaPattern = Pattern.compile("[Vic|][[T|t]oria]");
    List<String> victoriaNames = new ArrayList<>();
    victoriaNames.add("oria");
    victoriaNames.add("ia");
    victoriaNames.add("Poria");
    victoriaNames.add("Toria");
    victoriaNames.add("Vic");
    victoriaNames.add("Vicky");
    victoriaNames.add("Victo");
    victoriaNames.add("vic");
    for(String name : victoriaNames){
      Matcher victoriaMatcher = victoriaPattern.matcher(name);
      boolean found = victoriaMatcher.find();
      if(found){
        System.out.printf("Match name: %s\n", name);
        String group = victoriaMatcher.group();
        int start = victoriaMatcher.start();
        int end = victoriaMatcher.end();
        System.out.printf("group %s, start %d, end %d\n",
          group, start, end);
      } else{
        System.out.printf("No match found: %s\n", name);
      }
    }
  }
}
