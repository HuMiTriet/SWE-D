package com.swe.design.behaviorial.visitor;

public class Keyboard extends ComputerPart {

  public Keyboard(String id) {
    super(id);
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }

}
