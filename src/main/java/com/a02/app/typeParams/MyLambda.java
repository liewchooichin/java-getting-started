package com.a02.app.typeParams;

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface PrintAQuote {
  public abstract void printAQuote(String quote); 
}

// Weather
enum WeatherPredictor {
  CLOUDY,
  RAINING,
  SUNNY,
  HUMID;
}

@FunctionalInterface
interface RainingOrSunny {
  public abstract String predictWeather(WeatherPredictor weatherCondition);
}

public class MyLambda {
  public static Runnable r = () -> System.out.println("Hello");
  
  public static PrintAQuote p = (String quote) -> System.out.printf("A quote: \n\t%s\n", quote);

  // predict weather
  public static RainingOrSunny predictor = (WeatherPredictor weatherCondition) -> {
    String prediction = switch(weatherCondition){
      case CLOUDY, RAINING -> "Raining";
      case SUNNY, HUMID -> "Sunny";
      default -> "Unknown weather condition";
    };
    return prediction;
  };
  //  Suppose you need an instance of a Predicate that returns true
  // for strings of characters that have exactly 3 characters.
  public static Predicate<String> predicate = (String s) -> {
    boolean result = (s.length() == 3);
    return result;
  };
  // return string of length three
  public static List<String> checkStringLength3(List<String> strings){
    List<String> resultStringOfLength3 = new ArrayList<>();
    for(String s: strings){
      if(predicate.test(s)){
        resultStringOfLength3.add(s);
      }
    }
    return resultStringOfLength3;
  }
}
