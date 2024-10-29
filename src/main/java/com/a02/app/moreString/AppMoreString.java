package com.a02.app.moreString;

import com.a02.app.moreDataStructures.Item;
import com.a02.app.moreDataStructures.Stack;

public class AppMoreString {
  public static void main() {
    //FunWithCharacterCodes.main(new String[]{"dummy"});
    //CharacterArt.main(new String[]{"dummy"});
    //WorkingWithStrings.main(new String[]{"dummy"});
    //MyRegex.main(new String[]{"dummy"});
    InstanceFormatter.main(new String[]{"dummy"});
    SimpleBinary.main();
    MyDecimalFormat.main();
    // using Stack and Item
    Stack stack = new Stack(); // default 5 items
    Item[] items = {
      new Item("Banana"), 
      new Item("Papaya"), 
      new Item("Guava"), 
      new Item("Melon"), 
      new Item("Mandarin")};
    // add to stack
    for (Item i : items){
      stack.push(i);
    }
    System.out.println(stack);
    stack.push(new Item("Plum"));
    System.out.println("Plum was added to the stack.");
    stack.push(new Item("Peach"));
    System.out.println("Peach was added to the stack.");
    stack.push(new Item("Rambutan"));
    System.out.println("Peach was added to the stack.");
    stack.push(new Item("Jackfruit"));
    System.out.println("Peach was added to the stack.");
    System.out.println(stack);
    System.out.printf("Take a peek at the stack: %s\n", stack.peek().getName());
    // pop an item
    System.out.printf("%s was popped from the stack.\n", stack.pop().getName());
    System.out.printf("%s was popped from the stack.\n", stack.pop().getName());
    // current stack
    System.out.println(stack);
  }
}
