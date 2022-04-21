package com.swe.design.behaviorial.visitor;

public class BluetoothKeyboard extends ComputerPart {

  public BluetoothKeyboard(String id) {
    super(id);
  }

  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
