package com.swe.design.behaviorial.visitor;

public class ComputerPartAssignVisitor implements ComputerPartVisitor {
  private double level = 0.0;

  private double position = 0.0;

  @Override
  public void visitComputer(Computer computer) {
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
  public void visitMouse(Mouse mouse) {
    mouse.id = Double.toString(level + position);
  }

  @Override
  public void visitMonitor(Monitor monitor) {
    monitor.id = Double.toString(level + position);

  }

  @Override
  public void visitKeyboard(Keyboard keyboard) {
    keyboard.id = Double.toString(level + position);
  }

  @Override
  public void visitBluetoothKeyboard(BluetoothKeyboard bluetoothKeyboard) {
    bluetoothKeyboard.id = Double.toString(level + position);
  }
}
