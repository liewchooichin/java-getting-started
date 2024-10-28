package com.a02.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import com.a02.app.myDataStructures.OrderedPair;

public class OrderedPairTest {
  @Test
  void testOrderedPairStringString(){
    String key = "110A";
    String value = "brinjal";
    OrderedPair<String, String> op = new OrderedPair<>(key, value);
    assertEquals(key, op.getKey());
    assertEquals(value, op.getValue());
  }
  @Test  
  void testOrderedPairShortString(){
    Short key = Short.valueOf((short) 101);
    String value = "eggplant";
    OrderedPair<Short, String> op = new OrderedPair<>(key, value);
    assertEquals(key, op.getKey());
    assertEquals(value, op.getValue());
    assertEquals("Short", ((Object)key).getClass().getSimpleName());
    assertEquals("String", ((Object)value).getClass().getSimpleName());
  }
}
