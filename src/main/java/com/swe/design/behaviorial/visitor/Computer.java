package com.swe.design.behaviorial.visitor;

import java.util.ArrayList;

public class Computer extends ComputerPart {
  public ArrayList<ComputerPart> parts = new ArrayList<ComputerPart>();

  public Computer(String id) {
    super(id);
  }

  public void addPart(ComputerPart part) {
    parts.add(part);
  }

  public void removePart(ComputerPart part) {
    parts.remove(part);
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }

  public void deepCopy(Computer other) {
    other.parts = this.parts;
  }

}
