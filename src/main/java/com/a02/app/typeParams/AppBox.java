package com.a02.app.typeParams;

import java.util.ArrayList;
import java.util.Arrays;
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
    // Predicate
    List<String> testStrings = new ArrayList<>();
    testStrings.add("Hello");
    testStrings.add("Abc");
    testStrings.add("XYZ");
    testStrings.add("Raining");
    List<String> result = MyLambda.checkStringLength3(testStrings);
    for(String s: result){
      System.out.printf("Length %s is three characters long.\n", s);
    }
    // print some random number
    SupplierLambda.printRandomNumberVer1();
    SupplierLambda.printRandomNumberVer2();
    ConsumerLambda.printRandomNumberVer3();
    ConsumerLambda.printRandomNumberVer4();
    BiConsumerLambda.printRandomNumberVer5();
    // consumer lambda, add 10 to each number
    List<Integer> someNumbers = new ArrayList<>();
    someNumbers.add(11);
    someNumbers.add(12);
    someNumbers.add(13);
    ConsumerLambda.printNumbers(someNumbers);
    // test for negative
    someNumbers.add(-10);
    someNumbers.add(-9);
    someNumbers.add(-8);
    PredicateLambda.isNegative(someNumbers);
    System.out.printf("Is negative numbers: %s\n", someNumbers);
    // Remove string length greater than 5
    PredicateLambda.removeStringMoreThan5();
    // Function lambda
    FunctionLambda.add10ToNumbers();
    // UnaryOperator - Function
    List<String> words = Arrays.asList("one", "two", "three");
    FunctionLambda.changeToUppercase(words);
    System.out.println(words);
    // Find word in BiFunction
    FunctionLambda.findWord();
    // Square root using Function lamdba
    List<Double> numbersForSqrt = Arrays.asList(4.0, 9.0, 16.0);
    List<Double> resultSqrt;
    resultSqrt = MethodReference.CalculateSquareRoot(numbersForSqrt);
    System.out.println("Numbers: " + numbersForSqrt);
    System.out.println("Result of sqrt: " + resultSqrt);
  }
}
