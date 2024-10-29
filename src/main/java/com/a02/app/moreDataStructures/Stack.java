package com.a02.app.moreDataStructures;

public class Stack extends MySimpleDataStructure{
  // fields
  //private Item[] items; // inherited
  //private int maxCount; // inherited
  private int stackCount = 0;

  // default size 5 (maxCount)
  public Stack(int numItems) {
    maxCount = numItems;
    items = new Item[maxCount];
  }

  public Stack() {
    this(5);
  }

  /*
   * We will need a private void method named resizeArray.
   * If we increase our stack beyond the max size of the underlying
   * items array, we will need a way to resize it. By default, we will
   * increase it by 5 each time.
   */
  protected void resizeItemsArray() {
    maxCount = maxCount + 5; // increase max count
    Item[] newArray = new Item[maxCount];
    for (int counter = 0; counter < stackCount; counter++) {
      newArray[counter] = items[counter];
    }
    items = newArray;
  }

  /* Push */
  public void push(Item item) {
    int newStackCount = stackCount + 1;
    if (newStackCount >= maxCount) {
      resizeItemsArray();
    }
    stackCount = newStackCount;
    // stackCount-1 because index 0
    items[stackCount - 1] = item;
  }

  /* Pop - remove item from the top */
  /*
   * Note: We do not remove the item from the list. We simply decrement 
   * stackCount (number of items in the stack) so that it is out of range
   * for our stack-based operations. Now, we could remove the item by 
   * setting that location to a null or empty string. We could even shrink 
   * or reduce the size of itemsArray if we wanted to be efficient with our
   * memory footprint.
   */
  public Item pop() {
    Item returnVal = peek();
    items[stackCount-1] = null; // set the item to null
    stackCount = stackCount -1; // number of items in the stack
    return returnVal;
  }

  /* Peek, items are not removed */
  public Item peek() {
    Item returnVal = items[stackCount - 1];
    return returnVal;
  }
  /* getter */
  public int getStackCount() {
    return stackCount;
  }
  /* to string */
  @Override
  public String toString() {
    // String builder
    StringBuilder value = new StringBuilder("\n");
    for(int counter = stackCount-1; counter >= 0; counter--){
      value.append(counter);
      value.append(": ");
      value.append(items[counter].getName());
      value.append("\n");
    }
    return value.toString();
  }
}
