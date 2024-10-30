package com.a02.app.bicycle;

public class HelloWorldAnonymousClasses {

  interface HelloWorld {
      public void greet();
      public void greetSomeone(String someone);
  }

  public void sayHello() {
    
      // EnglishGreeting is a local class
      class EnglishGreeting implements HelloWorld {
          String name = "world";
          public void greet() {
              greetSomeone("world");
          }
          public void greetSomeone(String someone) {
              name = someone;
              System.out.println("Hello " + name);
          }
      }

      HelloWorld englishGreeting = new EnglishGreeting();

      // Anonymous class, used like a normal expression =
      HelloWorld frenchGreeting = new HelloWorld() {
          String name = "tout le monde";
          public void greet() {
              greetSomeone("tout le monde");
          }
          public void greetSomeone(String someone) {
              name = someone;
              System.out.println("Salut " + name);
          }
      }; // semicolon because anonymous class is an expression
      
      // Anonymous class
      HelloWorld spanishGreeting = new HelloWorld() {
          String name = "mundo";
          public void greet() {
              greetSomeone("mundo");
          }
          public void greetSomeone(String someone) {
              name = someone;
              System.out.println("Hola, " + name);
          }
      }; // semicolon because anonymous class is an expression
      englishGreeting.greet();
      englishGreeting.greetSomeone("Zebra");
      frenchGreeting.greet();
      frenchGreeting.greetSomeone("Fred");
      spanishGreeting.greet();
      spanishGreeting.greetSomeone("Giant clam");
  }

  public static void main() {
      HelloWorldAnonymousClasses myApp =
          new HelloWorldAnonymousClasses();
      myApp.sayHello();
  }
}
