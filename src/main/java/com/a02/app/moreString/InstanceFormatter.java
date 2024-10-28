package com.a02.app.moreString;

import com.a02.app.typeParams.WeatherPredictor;
import com.a02.app.typeParams.Box;


public class InstanceFormatter {
  // format a string according to the object
  // the switch can also be written as if
  // (o instanceof Integer i) {}
  public static String formattedOutput(Object o) {
    String formatter = switch (o) {
      case Character c -> String.format("char %c\n", c);
      case Integer i -> String.format("int %d\n", i);
      case Long l -> String.format("long %d\n", l);
      case Double d -> String.format("double %f\n", d);
      default -> String.format("Object %s\n", o.toString());
    };
    return formatter;
  }

  public static void main(String[] args) {
    System.out.println(formattedOutput('W'));
    System.out.println(formattedOutput((int)87));
    System.out.println(formattedOutput(45L));
    System.out.println(formattedOutput(3.14D));
    System.out.println(formattedOutput(WeatherPredictor.CLOUDY));
    Box<WeatherPredictor> humid = new Box<>();
    humid.box(WeatherPredictor.HUMID);
    System.out.println(formattedOutput(humid));
  }
}
