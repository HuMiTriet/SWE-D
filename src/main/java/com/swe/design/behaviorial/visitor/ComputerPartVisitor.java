package com.swe.design.behaviorial.visitor;

interface ComputerPartVisitor {

  void visit(Computer Computer);

  void visit(Keyboard keyboard);

  void visit(BluetoothKeyboard bluetoothKeyboard);

  void visit(Monitor monitor);

  void visit(Mouse mouse);
}
