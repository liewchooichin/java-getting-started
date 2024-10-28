package com.a02.app.myDataStructures;

public interface GenericPair<K, V> {
  public K getKey();
  public void setKey(K key);
  public V getValue();
  public void setValue(V value);
}
