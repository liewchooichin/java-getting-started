package com.a02.app.shape;

public class Square extends Shape {
  // Instance data
  protected double w;

  // Constructor
  public Square(double w) {
    this.w = w;
  }
  public Square(){
    this(1.0);
  }

  // Accessor methods
  public double getWidth() {
    return w;
  }

  public double getHeight() {
    return w;
  }

  // Implementation of abstract methods
  public double area() {
    return w * w;
  }

  public double circumference() {
    return (4 * w);
  }

  // String
  @Override
  public String toString(){
    String description = String.format("Square of width %.2f.\n", this.w);
    return description;
  }
}