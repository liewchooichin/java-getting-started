package com.a02.app.moreDataStructures;

public class Queue extends MySimpleDataStructure {
  // private Item[] items; // inherited
  // private int maxCount; // inherited
  private int queueCount = 0;

  // constructor
  public Queue() {
    this(5); // default queue size
  }

  public Queue(int numItems) {
    maxCount = numItems;
    items = new Item[maxCount];
  }

  // implement resize array
  protected void resizeItemsArray() {
    // increase the max number of items by 5
    maxCount = maxCount + 5;
    // instantiate larger items array
    Item[] newArray = new Item[maxCount];
    // copy current items array to new
    for (int counter = 0; counter < queueCount; counter++) {
      newArray[counter] = items[counter];
    }
    // override current items array with new array
    items = newArray;
  }

  /*
   * Queues typically have methods that allow the front and back
   * items in the queue to be viewed. We will create two getters
   * to handle that.
   */
  /*
   * Be careful when returning null from a method. In this case,
   * the calling method needs to be extra careful in how the return
   * values are processed, or a null pointer exception could occur.
   */
  public Item peekHead() {
    Item returnItem = null;
    if (queueCount > 0) {
      returnItem = items[0];
    } else {
      returnItem = null;
    }
    return returnItem;
  }

  public Item peekTail() {
    Item returnItem = null;
    if (queueCount > 0) {
      returnItem = items[queueCount - 1];
    } else {
      returnItem = null;
    }
    return returnItem;
  }

  // queue the item
  public void enqueue(Item item) {
    int newQueueCount = queueCount + 1;
    if (newQueueCount >= maxCount) {
      resizeItemsArray();
    }
    queueCount = newQueueCount;
    items[queueCount - 1] = item;
  }

  /*
   * Removing an item with the dequeue() method is a little tricky. First, we need
   * to
   * make sure the queue is not empty. If it is, calling the dequeue() method
   * should
   * return null.
   * Once we have the front item set as our return value, we need to move each
   * item
   * down one index position. With that complete, we can decrement queueCount and
   * return the front item.
   */
  public Item dequeue() {
    if (queueCount == 0) {
      return null;
    } else {
      Item returnItem = peekHead();
      // move all other items down to the head of the queue.
      // counter=0 (head) has already been removed. So, start
      // the shift from counter=1.
      for (int counter = 1; counter < queueCount; counter++) {
        items[counter - 1] = items[counter];
      }
      // decrement queue count
      queueCount = queueCount - 1;
      return returnItem;
    }
  }

  // getter
  public int getQueueCount() {
    return queueCount;
  }

  public String toString() {
    StringBuilder value = new StringBuilder("\n");
    for (int counter = 0; counter < queueCount; counter++) {
      value.append(counter);
      value.append(": ");
      value.append(items[counter].getName());
      value.append("\n");
    }
    // return the string
    return value.toString();
  }
}
