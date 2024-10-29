package com.a02.app.moreDataStructures;

public class AppMoreDataStructures {
  public static void main() {
    // using Stack and Item
    System.out.println("Stack examples");
    Stack stack = new Stack(); // default 5 items
    Item[] items = {
        new Item("Banana"),
        new Item("Papaya"),
        new Item("Guava"),
        new Item("Melon"),
        new Item("Mandarin") };
    // add to stack
    for (Item i : items) {
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

    // Using queue
    System.out.println("Queue example");
    Queue queue = new Queue();
    for(Item i : items){
      queue.enqueue(i);
    }
    System.out.println(queue);
    // add new item to the queue
    queue.enqueue(new Item("Plum"));
    System.out.println("Plum was added to the queue.");
    queue.enqueue(new Item("Peach"));
    System.out.println("Peach was added to the queue");
    // peek at the head of the queue
    System.out.printf("Head of queue: %s\n", queue.peekHead().getName());
    // peek at the tail of the queue
    System.out.printf("Tail of queue: %s\n", queue.peekTail().getName());
    // dequeue an item
    System.out.println("New queue.");
    System.out.printf("%s was dequeue.\n", queue.dequeue().getName());
    // dequeue again
    System.out.println("New queue.");
    System.out.printf("%s was dequeue.\n", queue.dequeue().getName());
    // current queue
    System.out.println(queue);

  }
}
