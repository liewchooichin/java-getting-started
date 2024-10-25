package com.a02.app.typeParams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.IntSupplier;

/**
 * Supplier interface
 * Reference
 * https://dev.java/learn/lambdas/functional-interfaces/
 */
// @FunctionalInterface
// interface Supplier<T> {
//   T get();  
// }

public class SupplierLambda {
  // get random integer
  public static void printRandomNumberVer1(){
    Random random = new Random(314L);
    // Supplier is a getter function
    Supplier<Integer> newRandom = () -> {
      return random.nextInt(10);
    };
    System.out.println("Random number");
    for(int index=0; index<5; index++){
      System.out.printf("\t%d\n", newRandom.get());
    }
  }
  // Using IntSupplier, almost the same code as Supplier
  public static void printRandomNumberVer2(){
    // seed the random generator to get the same number
    // every time.
    Random random = new Random(10L);
    // Supplier is a getter function, wrap to Integer
    IntSupplier newRandom = () -> {
      return random.nextInt(100);
    };
    System.out.println("Random number");
    for(int index=0; index<5; index++){
      System.out.printf("\t%d\n", newRandom.getAsInt());
    }
  }

}
