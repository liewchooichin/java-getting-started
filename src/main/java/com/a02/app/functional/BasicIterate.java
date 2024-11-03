package com.a02.app.functional;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class BasicIterate {
  public static void main() {
    // fizz buzz pop
    IntConsumer fizzbuzz35 = (i) -> {
      if((i%3==0) && (i%5==0)){
        System.out.printf("%d - FizzBuzz%n", i);
      }
    };
    // functional iteration
    IntStream.range(0, 50)
      .forEach(fizzbuzz35);
    // range closed
    IntConsumer fizzbuzz57 = (i) -> {
      if((i%5==0) && (i%7==0)){
        System.out.printf("%d - FooBar%n", i);
      }
    };
    IntStream.rangeClosed(0, 155)
      .forEach(fizzbuzz57);;

    // step iteration
    // Example, print the 3rd letter of this string
    String longSentences = "This is a long-long-long sentence.";
    System.out.println(longSentences);
    System.out.println("Every 3rd letter.");
    IntPredicate lessThanStringLen = (i) -> {return (i<longSentences.length());};
    IntUnaryOperator step3 = (i) -> {return (i+3);};
    IntConsumer printEveryThirdChar = (i) -> {
      System.out.printf("%c ", longSentences.charAt(i));
    };
    // step iteration
    IntStream.iterate(0, lessThanStringLen, step3)
      .forEach(printEveryThirdChar);
    // print a newline
    System.out.println();

    // Take while - break the loop
    // Same as the for iterate above
    IntStream.iterate(0, step3)
      .takeWhile(lessThanStringLen)
      .forEach(printEveryThirdChar);
    // print a newline
    System.out.println();


  }
}
