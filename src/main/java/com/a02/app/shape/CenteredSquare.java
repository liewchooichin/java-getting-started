package com.a02.app.shape;

public class CenteredSquare
    extends Square
    implements Centered {
  // New instance fields
  private double cx, cy;

  // A constructor
  public CenteredSquare(double cx, double cy,
      double w) {
    super(w);
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
    String description = String.format("Centered square with width %.2f  at (%.2f, %.2f).", w, cx,
        cy);
    return description;
  }
}
