package com.a02.app.myDataStructures;


public class OrderedPair<K, V> 
  implements GenericPair<K, V>{
    private K key;
    private V value;

    public OrderedPair(K key, V value){
      this.key = key;
      this.value = value;
    }

    public K getKey(){
      return key;
    }
    public void setKey(K key){
      this.key = key;
    }
    public V getValue(){
      return value;
    }
    public void setValue(V value){
      this.value = value;
    }
    @Override
    public String toString(){
      return String.format("Type: %s,\nKey: %s.\n"
      + "Type: %s, \nValue: %s.\n",
      key.getClass().getName(), key.toString(),
      value.getClass().getName(), value.toString());
    }
}