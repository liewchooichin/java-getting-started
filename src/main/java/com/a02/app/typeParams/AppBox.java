package com.a02.app.typeParams;

import java.util.ArrayList;
import java.util.List;

public class AppBox {
  public static void main(){
    // string box
     Box<String> redBox = new Box<>();
    redBox.box("Red");
    String colorOfBox = redBox.unbox();
    System.out.printf("Color of box: %s.\n", colorOfBox);

    // boolean box
    Box<Boolean> booleanBox = new Box<>();
    booleanBox.box(false);
    Boolean valueOfBox = booleanBox.unbox();
    System.out.printf("Value of box: %b.\n", valueOfBox);

    // Number box
    NumberBox<Short> shortBox = new NumberBox<>();
    shortBox.box((short)64);
    Short valueOfShortBox = shortBox.unbox();
    System.out.printf("Value of box: %d.\n", valueOfShortBox);

    // Traffic light
    Box<TrafficLight> trafficLight = new Box<>();
    trafficLight.box(TrafficLight.YELLOW);
    TrafficLight valueOfTrafficLight = trafficLight.unbox();
    System.out.printf("Value of traffic light %s.\n", valueOfTrafficLight);

    // ArrayList
    List<TrafficLight> listTrafficLight = new ArrayList<>();
    listTrafficLight.add(TrafficLight.GREEN);
    listTrafficLight.add(TrafficLight.YELLOW);
    listTrafficLight.add(TrafficLight.RED);
    for(TrafficLight tl: listTrafficLight){
      System.out.printf("Value of unknown box: %s.\n", tl);
    }
    // get a specific Suit
    TrafficLight redLight = TrafficLight.valueOf("RED");
    System.out.println("traffic light: " + redLight);
    for(TrafficLight tl: listTrafficLight){
      System.out.printf("Traffic light %s, value: %d, letter: %c.\n",
        tl.name(),tl.getValue(), tl.getLetter());
    }

    // Suit
    List<Suit> listSuit = new ArrayList<>();
    listSuit.add(Suit.CLUB);
    listSuit.add(Suit.SPADE);
    listSuit.add(Suit.HEART);
    listSuit.add(Suit.DIAMOND);
    for(Suit suit: listSuit){
      System.out.printf("Suit %s, symbol: %c, letter: %c.\n", 
      suit.name(), suit.getSymbol(), suit.getLetter());
    }
    // get values of Suit
    for(Suit suit: Suit.values()){
      System.out.printf("suit %s, symbol: %c, letter: %c.\n", 
      suit, suit.getSymbol(), suit.getLetter());
    }

    // Lambdas
    MyLambda.r.run();
    MyLambda.p.printAQuote("The world is flat.");
    String prediction = MyLambda.predictor.predictWeather(WeatherPredictor.CLOUDY);
    System.out.printf("Weather prediction: %s\n", prediction);
  }
}
