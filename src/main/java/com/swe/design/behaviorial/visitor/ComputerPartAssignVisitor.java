package com.swe.design.behaviorial.visitor;

public class ComputerPartAssignVisitor implements ComputerPartVisitor {
  private double level = 0.0;

  private double position = 0.0;

  @Override
  public void visit(Computer computer) {
    computer.id = Double.toString(level + position);
    position = 0.0;
    level++;
    for (int i = 0; i < computer.parts.size(); i++) {
      position += 0.1;
      computer.parts.get(i).accept(this);
    }
    level--;
  }

  @Override
  public void visit(Mouse mouse) {
    mouse.id = Double.toString(level + position);
  }

  @Override
  public void visit(Monitor monitor) {
    monitor.id = Double.toString(level + position);

  }

  @Override
  public void visit(Keyboard keyboard) {
    keyboard.id = Double.toString(level + position);
  }

  @Override
  public void visit(BluetoothKeyboard bluetoothKeyboard) {
    bluetoothKeyboard.id = Double.toString(level + position);
  }
}
