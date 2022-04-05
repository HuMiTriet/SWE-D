package com.swe.design.wip;

public class Leaf implements Node {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("Leaf: " + name);
  }
}
