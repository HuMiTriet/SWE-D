package com.swe.design.behaviorial.visitor;

abstract class ComputerPart {

  protected String id;

  public ComputerPart(String id) {
    this.id = id;
  }

  void accept(ComputerPartVisitor computerPartVisitor) {
  };
}
