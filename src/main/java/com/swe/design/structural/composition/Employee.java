package com.swe.design.structural.composition;

import java.util.ArrayList;

public class Employee {
  private String name;
  private ArrayList<Employee> subordinates = new ArrayList<Employee>();

  // setter for name
  public void setName(String name) {
    this.name = name;
  }

  // getter for name
  public String getName() {
    return this.name;
  }

  public void add(Employee e) {
    subordinates.add(e);
  }

  public void remove(Employee e) {
    subordinates.remove(e);
  }

  public void printSubordinate() {
    for (Employee e : subordinates) {
      System.out.println(e.getName());
      System.out.println("employee subordinates");
      e.printSubordinate();
    }
  }
}
