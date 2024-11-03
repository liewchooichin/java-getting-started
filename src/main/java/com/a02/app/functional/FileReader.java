package com.a02.app.functional;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
  public static void main() {
    // Basic file reader
    // Count the number of lines in the file.
    try {
      final var filePath = "./data/properties.txt";

      try(var stream = Files.lines(Path.of(filePath))){
        long count = stream.count();
        System.out.printf("File %s has %d lines.%n", filePath, count);
      }
    } catch(Exception exp){
      System.out.println(exp.getMessage());
    }
  }
}
