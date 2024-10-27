package com.a02.app.hello;

public class InvalidUnitException 
  extends RuntimeException{
  public InvalidUnitException(){
    super("The unit of measurement cannot be determined.");
  }
}
