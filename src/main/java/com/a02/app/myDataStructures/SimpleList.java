package com.a02.app.myDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;


public class SimpleList {
  public static void main() {
    String[] heroes = { "Byorki", "K'lar", "Tyrenni",
        "Athena", "Jarrod" };
    List<String> monsterList = new ArrayList<>();
    monsterList.add("Kobald");
    monsterList.add("Skeleton");
    monsterList.add("Zombie");
    monsterList.add("Rats");
    monsterList.add("Skeleton");
    monsterList.add("Onion");
    Collections.sort(monsterList);
    //sort(monsterList);
    System.out.println("Sorted monsters: " + monsterList);
    // get an item
    String item = monsterList.get(0);
    System.out.printf("Item at index 0: %s\n", item);
  }
}
