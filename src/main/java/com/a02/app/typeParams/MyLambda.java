package com.a02.app.typeParams;

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
  
  public static PrintAQuote p = (quote) -> System.out.printf("A quote: \n\t%s\n", quote);

  // predict weather
  public static RainingOrSunny predictor = (weatherCondition) -> {
    String prediction = switch(weatherCondition){
      case CLOUDY, RAINING -> "Raining";
      case SUNNY, HUMID -> "Sunny";
      default -> "Unknown weather condition";
    };
    return prediction;
  };
}
