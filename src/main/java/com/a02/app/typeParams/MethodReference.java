package com.a02.app.typeParams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReference {
  
  // square root
  public static Function<Double, Double> sqrt =
    (n) -> {
        n = Math.sqrt(n);
        return n;
      };
  public static List<Double> CalculateSquareRoot(List<Double> numbers){
    List<Double> result = new ArrayList<>();
    for(Double num: numbers){
      result.add(sqrt.apply(num));
    }
    return result;
  }

}
