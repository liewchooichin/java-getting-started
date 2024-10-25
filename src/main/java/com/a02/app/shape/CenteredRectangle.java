package com.a02.app.shape;

public class CenteredRectangle
    extends Rectangle
    implements Centered {
  // New instance fields
  private double cx, cy;

  // A constructor
  public CenteredRectangle(double cx, double cy,
      double w, double h) {
    super(w, h);
    this.cx = cx;
    this.cy = cy;
  }

  // provide implementations of all the Centered methods.
  public void setCenter(double x, double y) {
    cx = x;
    cy = y;
  }

  public double getCenterX() {
    return cx;
  }

  public double getCenterY() {
    return cy;
  }

  // toString
  @Override
  public String toString() {
    String description = String.format("Centered rectangle with width %.2f and height %.2f at (%.2f, %.2f).", w, h, cx, cy);
    return description;
  }
}
