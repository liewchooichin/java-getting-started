package com.a02.app.typeParams;

public class NumberBox<T extends Number>
  extends Box<T> {
  public int intValue(){
    return value.intValue();
  }
}
