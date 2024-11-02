package com.a02.app.inheritance;

/*
 * Subclass instance method will override superclass instance
 * methods.
 * Subclass static method will hide superclass static methods.
 */

public class Cat extends Animal {
  public static void testClassMethod() {
      System.out.println("The static method in Cat");
  }
  public void testInstanceMethod() {
      System.out.println("The instance method in Cat");
  }

  public static void mainCat() {
      Cat myCat = new Cat();
      System.out.println("Assign myCat = new Cat");
      Cat.testClassMethod();
      myCat.testInstanceMethod();
      
      Animal myAnimal = new Animal();
      System.out.println("Assign myAnimal = new Animal");
      Animal.testClassMethod();
      myAnimal.testInstanceMethod();
      
      myAnimal = myCat;
      System.out.println("Assign myAnimal = myCat");
      Animal.testClassMethod();
      myAnimal.testInstanceMethod();

      myAnimal = (Cat) myCat;
      System.out.println("Cat myAnimal = (Cat) myCat");
      Animal.testClassMethod();
      myAnimal.testInstanceMethod();

      //myCat = (Animal) myAnimal; // cannot convert from Animal to Cat
      boolean test = (myCat instanceof Animal);
      System.out.printf("myCat instanceof Animal: %b%n", test);
      
      System.out.println("Assign myAnimal = myCat");
      test = (myAnimal instanceof Cat);
      System.out.printf("myAnimal instanceof Cat: %b%n", test);

      myAnimal = new Animal();
      System.out.println("Assign a new animal: myAnimal = new Animal ");
      test = (myAnimal instanceof Cat);
      System.out.printf("myAnimal instanceof Cat: %b%n", test);
      

  }
}
