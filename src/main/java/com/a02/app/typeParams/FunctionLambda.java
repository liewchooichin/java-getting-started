package com.a02.app.typeParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// @FunctionalInterface
// public interface Function<T, R> {

//     R apply(T t);

//     // default and static methods removed
// }
public class FunctionLambda {
  // Add 10 to numbers
  // Function functional interface
  public static void add10ToNumbers(){
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    List<Integer> result = new ArrayList<>();
    Function<Integer, Integer> add10 = (num) -> 
      {
        num = num+10; 
        return num;
      };
    for(Integer num: numbers){
      result.add(add10.apply(num));
    }
    System.out.println("Original numbers: " + numbers);
    System.out.println("After add 10: " + result);
  }
  // to uppercase
  // UnaryOperator
  public static void changeToUppercase(List<String> words){
    UnaryOperator<String> toUpper = (word) -> {
      return word.toUpperCase();
    };
    words.replaceAll(toUpper);
  }
  // Find index of a word
  // BiFunction functional interface
  public static void findWord(){
    BiFunction<String, String, Integer> findWordInSentence =
    (w, sent) -> {return sent.indexOf(w);};
    List<String> sentences = Arrays.asList("one two", "two one", "one three two");
    List<Integer> result = new ArrayList<>();
    for(String sent: sentences){
      result.add(findWordInSentence.apply("two", sent));
    }
    System.out.println("Original words" + sentences);
    System.out.println("Find index of \'two\' in the sentences " + result);
    }
}
