package com.a02.app.myDataStructures;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class GenericBox<T> {
  private T t; // T - type
  public void set(T t){
    this.t = t;
  }
  public T get(){
    return t;
  }
  public String toString(){
    return String.format("Type: %s,\nContent: %s\n",
      t.getClass().getName(), t.toString());
  }
}
