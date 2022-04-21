package com.swe.design.behaviorial.visitor;

public class ReplaceVisitor implements ComputerPartVisitor {

  boolean passedAKeyboard = false;

  @Override
  public void visit(Computer computer) {

    for (int i = 0; i < computer.parts.size(); i++) {
      computer.parts.get(i).accept(this);

      if (passedAKeyboard) {
        computer.parts.set(i, new BluetoothKeyboard(computer.parts.get(i).id));
        passedAKeyboard = false;
      }

    }
  }

  @Override
  public void visit(Mouse mouse) {
  }

  @Override
  public void visit(Monitor monitor) {
  }

  @Override
  public void visit(Keyboard keyboard) {
    passedAKeyboard = true;
  }

  @Override
  public void visit(BluetoothKeyboard bluetoothKeyboard) {
  }

}
