package com.a02.app.myDataStructures;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SimpleMap {

  public static void main() {

    BiConsumer<Object, Object> printMap = (key, value) -> {
      System.out.printf("{%s: %s}\n", key, value);
    };

    // A map
    // HashMap is not thread safe.
    // Hashtable is thread safe.
    Map<String, String> productMap = new HashMap<>();
    productMap.put("110A", "Corns");
    productMap.put("111A", "Wheat grass");
    productMap.put("112B", "Brinjal");
    productMap.put("113C", "Cabbage");
    productMap.put("114C", "Bitter gourd");
    // print the map
    productMap.forEach(printMap);

    String accessItem = productMap.get("112B");
    System.out.printf("Item with key 112B is %s.\n",
        accessItem);
    // Now the linked hash map is reordered.
    productMap.forEach(printMap);
    // Output
    // {110A: Corns}
    // {111A: Wheat grass}
    // {112B: Brinjal}
    // {113C: Cabbage}
    // {114C: Bitter gourd}

    // Linked Hash Map
    //The least recently inserted entry (the eldest) is first, 
    // and the youngest entry is last.
    Map<String, String> productLHMap = new HashMap<>();
    productLHMap.put("110A", "Corns");
    productLHMap.put("111A", "Wheat grass");
    productLHMap.put("112B", "Brinjal");
    productLHMap.put("113C", "Cabbage");
    productLHMap.put("114C", "Bitter gourd");
    // print the map
    productLHMap.forEach(printMap);
    // {110A: Corns}
    // {111A: Wheat grass}
    // {112B: Brinjal}
    // {113C: Cabbage}
    // {114C: Bitter gourd}
    accessItem = productLHMap.get("112B");
    System.out.printf("Item with key 112B is %s.\n",
        accessItem);
    // Output
    productLHMap.forEach(printMap);
    // 
    // Item with key 112B is Brinjal.
    // {110A: Corns}
    // {111A: Wheat grass}
    // {112B: Brinjal}
    // {113C: Cabbage}
    // {114C: Bitter gourd}
    

  }
}
