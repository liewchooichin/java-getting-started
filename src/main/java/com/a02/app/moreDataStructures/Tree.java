package com.a02.app.moreDataStructures;

public class Tree {
  private Node root;

  // constructor
  public Tree() {

  }

  public Tree(int number) {
    root = new Node(number);
  }

  // insert a node
  public void insert(int number) {
    if (root == null) {
      root = new Node(number);
    } else {
      root.insert(number);
    }
  }

  /*
   * The traverse() method checks if the node it passed is null.
   * If so, it simply returns with no further action. If it has a
   * value, traverse() calls itself recursively on the left and
   * right nodes until it reaches a leaf node.
   */
  public void traverseFromRoot() {
    traverse(root);
  }

  private void traverse(Node node) {
    if (node == null) {
      return;
    }
    traverse(node.getLeftNode());
    System.out.println(node.getValue());
    traverse(node.getRightNode());
  }

  /* Reverse the direction */
  public void reverseFromRoot() {
    reverse(root);
  }

  private void reverse(Node node) {
    if (node == null) {
      return;
    }
    reverse(node.getRightNode());
    System.out.println(node.getValue());
    reverse(node.getLeftNode());
  }
}
