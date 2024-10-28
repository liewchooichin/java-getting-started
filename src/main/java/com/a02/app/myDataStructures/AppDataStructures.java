package com.a02.app.myDataStructures;

import java.util.ArrayList;
import java.util.List;

public class AppDataStructures {
  public static void main() {
    WorkingWithCollections.main(new String[] { "dummy" });
    // Box<T> generic box
    GenericBox<Short> shortBox = new GenericBox<>();
    shortBox.set(Short.valueOf((short) 101));
    System.out.println(shortBox);
    // Ordered Pair<K, V> key value pair
    GenericPair<String, Integer> p1 = new OrderedPair<>("Eleven", 11);
    GenericPair<String, String> p2 = new OrderedPair<>("animal", "cat");
    System.out.println(p1);
    System.out.println(p2);
    // Using generic Box in Ordered Pair
    GenericPair<String, GenericBox<Short>> p3 = new OrderedPair<String, GenericBox<Short>>("short-key", shortBox);
    System.out.println(p3);
    // compare ordered par
    GenericPair<Short, String> vege1 = new OrderedPair<Short, String>(Short.valueOf((short) 112), "pumpkin");
    GenericPair<Short, String> vege2 = new OrderedPair<Short, String>(Short.valueOf((short) 112), "pumpkin");
    GenericPair<Short, String> vege3 = new OrderedPair<Short, String>(Short.valueOf((short) 113), "broccoli");
    // compare vege2 and vege3
    boolean same = Util.<Short, String>compare(vege2, vege3);
    System.out.printf("%s and %s are %s \n",
        vege2, vege3, (same ? "the same" : "different"));
    // compare vege1 and vege2
    same = Util.<Short, String>compare(vege1, vege2);
    System.out.printf("%s and %s are %s \n",
        vege1, vege2, (same ? "the same" : "different"));
    // call the simple collection
    SimpleSet.main();
    // List
    SimpleList.main();
    // Map
    SimpleMap.main();
    // Record of a game with rooms and exits.
    List<String> cabinExits = new ArrayList<>();
    cabinExits.add("South");
    cabinExits.add("West");
    // room record
    RoomRecord lakeCabin = new RoomRecord("Lake cabin",
      "You are standing outside of a cabin"
      + " on a lake,\nwith water visible to the South and "
      + "East.\nThere is a red dock to the South.", 
      cabinExits);
      // print the room record
      System.out.println(lakeCabin.name());
      System.out.println(lakeCabin.description());
      System.out.println(lakeCabin.getExits());
  }
}
