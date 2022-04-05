package com.swe.design.wip;

public class Branch implements Node {
  private Node left = null;
  private Node right = null;
  private String name = "null";

  public Branch(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("Branch: " + name);
    if (left != null) {
      left.print();
    }
    if (right != null) {
      right.print();
    }
  }

  public void addLeft(Node node) {
    left = node;
  }

  public void addRight(Node node) {
    right = node;
  }

}
