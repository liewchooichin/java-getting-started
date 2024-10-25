package com.a02.app.shape;

// Interface extends another interface
public interface Positionable extends Centered {
  void setUpperRightCorner(double x, double y);
  double getUpperRightX();
  double getUpperRightY();

  void setLowerLeftCorner(double x, double y);
  double getLowerLeftX();
  double getLowerLeftY();
}
