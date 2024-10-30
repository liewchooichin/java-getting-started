package com.a02.app.bicycle;

/*
 * https://dev.java/learn/classes-objects/creating-classes/
 */
public class Bicycle {

  // the Bicycle class has
  // three fields
  private int cadence;
  private int gear;
  private int speed;
  private int id;

  private static int numberOfBicycles = 0;

  // the Bicycle class has
  // one constructor
  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    id = ++numberOfBicycles;
  }

  // the Bicycle class has
  // four methods
  public int getId() {
    return id;
  }

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public int getSpeed() {
    return speed;
  }

  public void applyBrake(int decrement) {
    speed = speed - decrement;
  }

  public void speedUp(int increment) {
    speed = speed + increment;
  }
}
