package com.a02.app.typeParams;

import java.util.function.BiConsumer;
import java.util.Random;

/*
 * @FunctionalInterface
public interface BiConsumer<T, U> {

    void accept(T t, U u);

    // default methods removed
}
 */
public class BiConsumerLambda {
  // BiConsumer interface lambda
  public static BiConsumer<Random, Integer> randomNumberPrinter =
    (random, length) -> {
      for(int i=0; i<length; i++){
        System.out.println(random.nextInt(100));
      }
    };
  // method to call the lambda
  public static void printRandomNumberVer5(){
    randomNumberPrinter.accept(new Random(100L), 5);
  }
}
