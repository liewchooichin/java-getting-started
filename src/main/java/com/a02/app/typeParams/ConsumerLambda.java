package com.a02.app.typeParams;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

/*
 * interface Consumer<T> {
    void accept(T t);
  }
 */
public class ConsumerLambda {
  // a simple consumer
  public static Consumer<String> printALine = (s) -> {System.out.printf(s);};
  // test for number greater than 50
  public static Consumer<Integer> greaterThan50 = (i) -> {
    if(i > 50){
      System.out.printf("%d is greater than 50.\n", i);
    }
  };

  // using the consumer
  public static void printRandomNumberVer3(){
    Random random = new Random(314L);
    // Supplier is a getter function
    IntSupplier newRandom = () -> {
      return random.nextInt(85);
    };
    System.out.println("Random number");
    for(int index=0; index<5; index++){
      printALine.accept(String.format("\t%d\n", newRandom.getAsInt()));
    }
  }
  // print number greater than 50
  public static void printRandomNumberVer4(){
    Random random = new Random(314L);
    // Supplier is a getter function
    IntSupplier newRandom = () -> {
      return random.nextInt(100);
    };
    System.out.println("Random number");
    for(int index=0; index<5; index++){
      greaterThan50.accept(newRandom.getAsInt());
    }
  }

}
