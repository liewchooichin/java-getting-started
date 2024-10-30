package com.a02.app.moreDataStructures;

/*
 * Note: The definition for the Node class contains two objects of the 
 * Node class: leftNode and rightNode. This is known as a self-referential
 * class. This is how one node will maintain references to other nodes in 
 * the tree.
 */
public class Node {
  private int value;
  private Node leftNode;
  private Node rightNode;

  // constructor
  public Node(int number) {
    this.value = number;
  }

  /*
   * binary tree:
   * If newNumber is less than the value of the current node, our
   * logic moves down the left side of the node. If newNumber is
   * greater than the value of the current node, our logic moves
   * down the right side of the node.
   * Ignore duplicate (same) number.
   */
  public void insert(int newNumber) {
    if (newNumber < this.value) {
      if (leftNode == null) {
        leftNode = new Node(newNumber);
      } else {
        leftNode.insert(newNumber);
      }
    } else if (newNumber > this.value) {
      if (rightNode == null) {
        rightNode = new Node(newNumber);
      } else {
        rightNode.insert(newNumber);
      }
    }
  }
  // getters
  public Node getLeftNode() {
    return this.leftNode;
  }

  public Node getRightNode() {
    return this.rightNode;
  }

  public int getValue() {
    return this.value;
  }
}
