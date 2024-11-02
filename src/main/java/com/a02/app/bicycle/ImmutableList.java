package com.a02.app.bicycle;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.UnsupportedOperationException;


public class ImmutableList {
  public static void main() {
    Integer[] intArray = {1, 2, 3};

    // Immutable list
    List<Integer> immutableList = List.of(intArray);
    System.out.println("Original immutable list: " + immutableList);
    System.out.println("Set immutableList[0] = 99");
    try{
      immutableList.set(0, 99);
    } catch(Exception exp){
      System.out.println("Cannot set an element of an immutable list.");
      System.out.println(exp.getMessage());
    }
    try{
      immutableList.remove(0);
    } catch(Exception exp){
      System.out.println("Cannot remove an element from an immutable list.");
      System.out.println(exp.getMessage());
    }

    // Mutable list
    Integer[] intArray2 = {100, 200, 300};
    List<Integer> mutableList = new ArrayList<Integer>(Arrays.asList(intArray2));
    System.out.println("Original mutable list: " + mutableList);
    System.out.println("Set mutableList[0] = 787");
    mutableList.set(0, 787);
    System.out.println("Now: " + mutableList);
    System.out.println("Remove an element from mutable list");
    mutableList.remove(0);
    System.out.println("Now: " + mutableList);
    System.out.println("Remove an element from mutable list");

  }
}
