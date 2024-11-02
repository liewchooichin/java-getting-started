package com.a02.app.bicycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppBicycle {
  public static void main() {
    OuterClass.main();
    ShadowTest.main();
    LocalClassExample.main();
    HelloWorldAnonymousClasses.main();
    // Using enum
    DayOfWeek weekStart = DayOfWeek.MONDAY;
    /*
     * In order to check whether two instances of an enum are
     * the same, the == operator can be used.
     */
    if (weekStart == DayOfWeek.MONDAY) {
      System.out.println("The week starts on Monday.");
    }

    DayOfWeek friday = DayOfWeek.FRIDAY;

    String text = switch (friday) {
      case MONDAY ->
        "The week just started.";
      case TUESDAY, WEDNESDAY, THURSDAY ->
        "We are somewhere in the middle of the week.";
      case FRIDAY ->
        "The weekend is near.";
      case SATURDAY, SUNDAY ->
        "Weekend";
      default ->
        throw new AssertionError("Should not happen");
    };
    System.out.println(text);
    // instance method
    System.out.println("Abbreviation: " + friday.getAbbreviation());
    // special methods
    System.out.println(DayOfWeek.MONDAY.name());    // prints "MONDAY"
    System.out.println(DayOfWeek.MONDAY.ordinal()); // prints "0" because MONDAY is the first constant in the DayOfWeek enum
    DayOfWeek[] days = DayOfWeek.values(); // all days of the week
    DayOfWeek monday = DayOfWeek.valueOf("MONDAY"); // can be used to get a specific instance by its name.
    for(DayOfWeek d: days){
      System.out.println(d);
    }
    System.out.println(monday + " is " + monday.getAbbreviation());
    // compare day of week
    monday.compareDayOfWeek(monday); // It's before the middle of the work week.
    friday.compareDayOfWeek(friday); // It's after the middle of the work week.
    DayOfWeek wednesday = DayOfWeek.WEDNESDAY; 
    wednesday.compareDayOfWeek(wednesday); // It's the middle of the work week.

    // list of days
    List<DayOfWeek> daysList = new ArrayList<>(
      List.of(DayOfWeek.FRIDAY, DayOfWeek.TUESDAY, DayOfWeek.SATURDAY));
    Collections.sort(daysList);
    System.out.println("Sorted days: " + daysList);

    // Inheritance
    MountainBike myMB = new MountainBike(50, 50, 50, "A Suspend");
    Object objMB = new MountainBike(20, 20, 20, "B Suspension");
    //MountainBike myBike = objMB; // compile error
    // Need to test for the instanceof
    if(objMB instanceof Bicycle){
      System.out.println("objMB is instance of Bicycle");
    }
    if(objMB instanceof MountainBike){
      System.out.println("objMB is instance of MountainBike");
    }
    // before assignment
    System.out.println("Before assignment");
    System.out.printf("Id of myMB: %s%n", System.identityHashCode(myMB));
    System.out.printf("Id of objMB: %s%n", System.identityHashCode(objMB));
    // after assignment
    objMB = myMB;
    System.out.println("After assignment");
    System.out.printf("Id of myMB: %s%n", System.identityHashCode(myMB));
    System.out.printf("Id of objMB: %s%n", System.identityHashCode(objMB));

    // With road bike
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();

    // Immutable and mutable list
    ImmutableList.main();
    
  }
}
