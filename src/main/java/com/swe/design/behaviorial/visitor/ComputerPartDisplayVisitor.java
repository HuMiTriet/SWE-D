package com.swe.design.behaviorial.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
  private int level = 0;

  private String getSpaces() {
    String spaces = "";
    for (int i = 0; i < level; i++) {
      spaces += "__";
    }
    return spaces;
  }

  @Override
  public void visit(Computer computer) {
    System.out.println(getSpaces() + "COMPUTER: " + computer.id);
    level++;
    for (int i = 0; i < computer.parts.size(); i++) {
      computer.parts.get(i).accept(this);
    }
    level--;
  }

  @Override
  public void visit(Mouse mouse) {
    System.out.println(getSpaces() + "MOUSE: " + mouse.id);

  }

  @Override
  public void visit(Monitor monitor) {
    System.out.println(getSpaces() + "MONITOR" + monitor.id);

  }

  @Override
  public void visit(Keyboard keyboard) {
    System.out.println(getSpaces() + "KEYBOARD: " + keyboard.id);

  }

  @Override
  public void visit(BluetoothKeyboard bluetoothKeyboard) {
    System.out.println(getSpaces() + "BLUETOOTH_KEYBOARD: " + bluetoothKeyboard.id);
  }
}
