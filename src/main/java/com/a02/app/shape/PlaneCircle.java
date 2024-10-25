package com.a02.app.shape;

public class PlaneCircle extends Circle {
  private final double cx, cy;
  // constructor
  public PlaneCircle(double r, double x, double y)
  {
    super(r);
    this.cx = x;
    this.cy = y;
  }
  public PlaneCircle()
  {
    this(1.0, 0.0, 0.0);
  }
  // getter
  public double getCenterX()
  {
    return this.cx;
  }
  public double getCenterY()
  {
    return this.cy;
  }
  // The area() and circumference() methods are inherited from Circle
// A new instance method checks whether a point is inside the circle
// Note that it uses the inherited instance field r
public boolean isInside(double x, double y){
  double dx = x - cx;
  double dy = y - cy; // distance from center
  double distance = Math.sqrt((dx*dx) + (dy*dy)); // Pythagorean theorem
  return (distance < r);
}
// to string
@Override
public String toString(){
  String value = String.format("Plane circle with radius %f, and center at (%f, %f).", 
  this.r, this.cx, this.cy);
  return value;
}
}
