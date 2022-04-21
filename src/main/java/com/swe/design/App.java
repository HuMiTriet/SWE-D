package com.swe.design;

import com.swe.design.behaviorial.visitor.ClientVisitor;

public class App {

  public static void main(String[] args) {
    ClientVisitor.execute(args);
  }
}
