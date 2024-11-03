package com.a02.app.functional;

import java.util.Properties;

public class SystemProperties {
  public static void main() {
   Properties prop = System.getProperties();
   // print the whole list
   //prop.list(System.out);
   // get a certain property
   String result = prop.getProperty("java.vm.version");
   System.out.println("VM versin: " + result);
  }
}
