package com.a02.app.shape;

public class CenteredCircle
  extends Circle 
  implements Centered {
    // New instance fields
    private double cx, cy;
    // A constructor
    public CenteredCircle(double cx, double cy,
      double r){
        super(r);
        this.cx = cx;
        this.cy = cy;
      }
    // provide implementations of all the Centered methods.
    public void setCenter(double x, double y){
      cx = x;
      cy = y;
    }
    public double getCenterX(){return cx;}
    public double getCenterY(){return cy;}
    // toString
    @Override
    public String toString(){
      String description = String.format("Centered circle with radius %.2f at (%.2f, %.2f).", r, cx, cy);
      return description;
    }
}

