package com.a02.app.shape;

public class Circle extends Shape {
  // A class field
  public static final double PI = 3.14159;
  // An instance field that holds the radius of the circle
  protected double r;

  // constructor with initializer
  public Circle(double r) {
    this.r = r;
  }

  // default constructor
  public Circle() {
    this(1.0); // use this to invoke the Circle(double r)
  };

  // A useful constant
  // A class method: just compute a value based on the arguments
  public static double radiansToDegrees(double radians) {
    return radians * 180 / Circle.PI;
  }

  public static double degreesToRadians(double degrees) {
    return Circle.PI * degrees / 180;
  }

  // public getter and setter for r
  // Check for negative radius
  protected void checkRadius(double radius) {
    if (radius < 0.0) {
      throw new IllegalArgumentException("Illegal negative radius");
    }
  }

  public void setRadius(double radius) {
    checkRadius(radius);
    this.r = radius;
  }

  public double getRadius() {
    return this.r;
  }

  // The radius of the circle
  // Two instance methods: operate on an object's instance fields
  // Compute the area of the circle
  public double area() {
    return Circle.PI * r * r;
  }

  // Compute the circumference of the circle
  public double circumference() {
    return 2 * Circle.PI * r;
  }

  // to string
  public String toString() {
    String value = String.format("Cicle with radius %f", this.r);
    return value;
  }
}
