package com.swe.design.behaviorial.visitor;

public class Monitor extends ComputerPart {

  public Monitor(String id) {
    super(id);
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }

}
