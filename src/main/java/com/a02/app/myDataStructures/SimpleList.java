package com.a02.app.myDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class SimpleList {
  public static void main() {
    String[] heroes = { "Byorki", "K'lar", "Tyrenni",
        "Athena", "Jarrod" };
    // ArrayList is not thread safe.
    // Vector is thread safe.
    List<String> monsterList = new ArrayList<>();
    monsterList.add("Kobald");
    monsterList.add("Skeleton");
    monsterList.add("Zombie");
    monsterList.add("Rats");
    monsterList.add("Skeleton");
    monsterList.add("Onion");
    Collections.sort(monsterList);
    // sort(monsterList);
    System.out.println("Sorted monsters: " + monsterList);
    // get an item
    String item = monsterList.get(0);
    System.out.printf("Item at index 0: %s\n", item);
    // LinkedList
    LinkedList<String> cityLinkedList = new LinkedList<>();
    cityLinkedList.add("Elddim");
    cityLinkedList.add("CrystalWind");
    cityLinkedList.add("Fallraen");
    cityLinkedList.add("Meren");
    cityLinkedList.add("LangHopper");
    System.out.println(cityLinkedList);
    int indexCity = cityLinkedList.indexOf("Meren");
    System.out.printf("Index of Meren: %d\n", indexCity);
    String cityItem = cityLinkedList.get(0);
    System.out.printf("City at index 0 is %s.\n", cityItem);
    // peek at the top of the list
    String firstCity = cityLinkedList.peek();
    System.out.printf("First city: %s\n", firstCity);
    String lastCity = cityLinkedList.peekLast();
    System.out.printf("Last city: %s\n", lastCity);
    String pollLastCity = cityLinkedList.pollLast();
    System.out.printf("Retrieves and removes the last city: %s\n",
      pollLastCity);
    // now the linked list becomes
    System.out.println(cityLinkedList);
  }
}
