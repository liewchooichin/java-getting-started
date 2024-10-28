package com.a02.app.myDataStructures;

public class Util {
  public static <K, V> boolean compare(
    GenericPair<K, V> p1, GenericPair<K, V> p2){
      return (
        p1.getKey().equals(p2.getKey())
        && p1.getValue().equals(p2.getValue())
      );
    }
}
