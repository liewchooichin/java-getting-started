package com.a02.app.typeParams;

import java.util.ArrayList;
import java.util.List;

public class PredicateLambda {
  // test for integer less than 0 (negavtive)
  public static void isNegative(List<Integer> numberList){
    Predicate<Integer> testNegative = (n) -> {return (n < 0);};
    for(int num: numberList){
      boolean result = testNegative.test(num);
      System.out.printf("%d is %s\n",
          num, 
          result==true ? "nagative" : "positive"
        );
    }
  }

  // using Predicate
  // remove string of even length
  // Arrays.asList() produces a collection that behaves like an array. You can 
  // mutate its existing elements, but you are not allowed to add or remove 
  // elements from the list.
  // So you should not call removeIf() on an immutable collection, like the 
  // ones produced by the List.of() factory methods.
  public static void removeStringMoreThan5(){
    List<String> immutableStrings =
        List.of("one", "two", "three", "eleven", "five");
    List<String> strings = new ArrayList<>(immutableStrings);
    Predicate<String> isEvenLength = s -> s.length() >= 5;
    System.out.println("Original strings = " + strings);
    strings.removeIf((s)->isEvenLength.test(s));
    System.out.println("After removing strings = " + strings);
  }
}
