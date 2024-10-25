package com.a02.app.shape;

public class Rectangle extends Shape {
  // Instance data
  protected double w, h;

  // Constructor
  public Rectangle(double w, double h) {
    this.w = w;
    this.h = h;
  }
  public Rectangle(){
    this(1.0, 1.0);
  }

  // Accessor methods
  public double getWidth() {
    return w;
  }

  public double getHeight() {
    return h;
  }

  // Implementation of abstract methods
  public double area() {
    return w * h;
  }

  public double circumference() {
    return 2 * (w + h);
  }

  // String
  @Override
  public String toString(){
    String description = String.format("Rectangle of width %.2f and height %.2f.", this.w, this.h);
    return description;
  }
}