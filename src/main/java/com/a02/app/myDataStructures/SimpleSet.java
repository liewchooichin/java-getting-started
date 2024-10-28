package com.a02.app.myDataStructures;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {
  //print the collection
  public static void printCollection(Collections[] collection){
    for(Object o : collection)
    System.out.println(o);
  }

  public static void main() {
    String[] heroes = {"Byorki", "K'lar", "Tyrenni",
"Athena", "Jarrod"};
    // HashSet
    Set<String> heroSet1 = new HashSet<>();
    Collections.addAll(heroSet1, heroes);
    // add the same name to the HashSet, it will only
    // keep one set of unique name
    heroSet1.add("Byorki");
    heroSet1.add("Athena");
    heroSet1.add("Storm"); // item will be added to the head of the list
    heroSet1.add("Thunder"); // item will be added to the head of the list
    System.out.printf("Heros: %s\n", heroSet1);
    // Output
    // Heros: [Storm, Thunder, Byorki, K'lar, Tyrenni, Athena, Jarrod]
    
    // Linked Hash Set, will add unique items.
    // Linked hash set will add items in a sequential manner
    Set<String> heroSet2 = new LinkedHashSet<>();
    Collections.addAll(heroSet2, heroes);
    heroSet2.add("Byorki"); // unique value, won't be added
    heroSet2.add("Athena"); //unique value, won't be added
    heroSet2.add("Zero"); // add to the tail of the list
    heroSet2.add("Oneth"); // add to the tail of the list
    System.out.printf("Heros: %s\n", heroSet2);
    // Output
    // Heros: [Byorki, K'lar, Tyrenni, Athena, Jarrod, Zero, Oneth]

    // Tree Set is sorted order
    Set<String> heroSet3 = new TreeSet<>();
    Collections.addAll(heroSet3, heroes);
    heroSet3.add("Byorki"); // unique value, won't be added
    heroSet3.add("Athena"); //unique value, won't be added
    heroSet3.add("Zero");
    heroSet3.add("Oneth");
    System.out.printf("Heros: %s\n", heroSet3);
    // Output
    // Heros: [Athena, Byorki, Jarrod, K'lar, Oneth, Tyrenni, Zero]

  }
}
