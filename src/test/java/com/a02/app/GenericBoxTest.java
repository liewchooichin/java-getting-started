package com.a02.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import com.a02.app.myDataStructures.GenericBox;

public class GenericBoxTest {
    @Test
    void testGenericBox(){
      GenericBox<String> stringBox = new GenericBox<>();
      stringBox.set("test box");
      String content = stringBox.get();
      assertEquals("test box", content);
    }
}
