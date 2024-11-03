package com.a02.app.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ForEachIterate {
  public static void main() {
    // iterate through an array
    System.out.println("Print names in a list.");
    List<String> names = List.of("Jupiter Start", 
    "Pancake", "Mooncake", "Moomin", "Juniper", "Jerry Tom");
    Consumer<String> filterNames = (name) -> {
      char ch = '\u2614'; // umbrella
      System.out.println(ch + "  " + name.toUpperCase());
    };
    names.stream()
      .forEach(filterNames);

    // iterate with filter
    System.out.println("Filter with names starting with J.");
    names.stream()
      .filter(name -> name.startsWith("J"))
      .forEach(filterNames);

    // iterate with mapping
    Function<String, String> formatNames = (name) -> {
      StringBuilder formattedName = new StringBuilder();
      formattedName.append('\u26F4'); // boat
      formattedName.append("  " + name.toUpperCase());
      return formattedName.toString();
    };
    List<String> newNameList = new ArrayList<>();
    newNameList = names.stream()
      .map(formatNames)
      .toList();
    // print the new list
    System.out.println("Format names into a new list");
    newNameList.stream()
      .forEach(name -> System.out.println(name));

    // filter the element before mapping
    newNameList = names.stream()  
      .filter(name -> name.startsWith("M"))
      .map(formatNames)
      .toList();
    // print the new list
    System.out.println("Format only names that start with M");
    newNameList.stream()
      .forEach(name -> System.out.println(name));
  }
}
