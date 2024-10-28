package com.a02.app.typeParams;

public class Box<T> {
  @NotNull protected T value;
  // set the value
  public void box(T t){
    value = t;
  }
  // get the value
  public T unbox(){
    T t = value;
    value = null; // reset value
    return t;
  }
  // to string
  @Override
  public String toString(){
    return this.getClass().getCanonicalName();
  }
}
