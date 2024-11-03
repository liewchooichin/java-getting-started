package com.a02.app.functional;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LiveDataStream {

  static int wordOccurences = 0;
  static int lineNumber = 0;

  public static void main() {
    try{
      final var filePath = "./data/properties.txt";
      final var word = "Properties";
      // Find the number of occurences of a word
      Pattern pattern = Pattern.compile("\\bProperties\\b");
      Consumer<String> filterWord = line -> {
        // increment line number for the next line
        lineNumber = lineNumber + 1;
        // Match the regex pattern
        Matcher matcher = pattern.matcher(line);
        boolean matcherFound = matcher.find();
        // If there is a match
        while(matcherFound){
          String group = matcher.group();
          int start = matcher.start();
          int end = matcher.end();
          System.out.println("Found the word " + group + " at index [" + start 
            + ", " + end + "]" + " at line " + lineNumber);
          wordOccurences = wordOccurences + 1;
          // find again if there is any match.
          if(end+1 < line.length()){
            matcherFound = matcher.find(end+1); // if false, the while loop break.
            continue;
          }
        }
        //return found;
      };
      try(var stream = Files.lines(Path.of(filePath))){
        // result: Only 2 lines contains the word Properties.
        // this line will only work if there is only one occurence
        // in the line.
        //long count = stream.filter(filterWord).count();

        // To find multiple occurences in one line, use this:
        stream.forEach(filterWord);
        // pring the word count
        String result = String.format("The word %s occurs %d times.%n",
          word, wordOccurences);
        System.out.println(result);
      }
    } catch(Exception exp){
      System.out.println("Error: " + exp.getMessage());
    }
    
    return;
  }
}
