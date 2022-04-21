package com.swe.design.behaviorial.visitor;

interface ComputerPartVisitor {

  void visitComputer(Computer Computer);

  void visitKeyboard(Keyboard keyboard);

  void visitBluetoothKeyboard(BluetoothKeyboard bluetoothKeyboard);

  void visitMonitor(Monitor monitor);

  void visitMouse(Mouse mouse);
}
