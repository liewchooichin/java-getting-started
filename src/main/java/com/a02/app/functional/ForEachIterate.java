package com.a02.app.functional;

import java.util.List;
import java.util.function.Consumer;

public class ForEachIterate {
  public static void main() {
    // iterate through an array
    System.out.println("Print names in a list.");
    List<String> names = List.of("Jupiter Start", 
    "Pancake", "Mooncake", "Moomin", "Juniper", "Jerry Tom");
    Consumer<String> processNames = (name) -> {
      char ch = '\u2614'; // umbrella
      System.out.println(ch + "  " + name.toUpperCase());
    };
    names.stream()
      .forEach(processNames);

    // iterate with filter
    System.out.println("Filter with names starting with J.");
    names.stream()
      .filter(name -> name.startsWith("J"))
      .forEach(processNames);

    // iterate with mapping
    
  }
}
