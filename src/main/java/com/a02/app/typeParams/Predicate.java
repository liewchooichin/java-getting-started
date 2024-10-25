package com.a02.app.typeParams;

@FunctionalInterface
public interface Predicate<T> {
  boolean test(T t);
}
