package com.swe.design.behaviorial.visitor;

public class Mouse extends ComputerPart {

  public Mouse(String id) {
    super(id);
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);

  }
}
