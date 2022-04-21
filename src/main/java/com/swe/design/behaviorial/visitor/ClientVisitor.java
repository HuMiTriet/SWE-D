package com.swe.design.behaviorial.visitor;

public class ClientVisitor {
  public static void execute(String[] args) {

    Computer computer = new Computer("");

    Mouse mouse = new Mouse("");
    Keyboard keyboard = new Keyboard("");
    Computer subComputer = new Computer("");

    Computer subSubComputer = new Computer("");
    Mouse subMouse = new Mouse("");
    Keyboard subKeyboard = new Keyboard("");

    Monitor subSubSubMonitor = new Monitor("");
    Keyboard subSubSubKeyboard = new Keyboard("");

    subSubComputer.addPart(subSubSubMonitor);
    subSubComputer.addPart(subSubSubKeyboard);

    subComputer.addPart(subSubComputer);
    subComputer.addPart(subMouse);
    subComputer.addPart(subKeyboard);

    computer.addPart(mouse);
    computer.addPart(keyboard);
    computer.addPart(subComputer);

    ComputerPartAssignVisitor assignVisitor = new ComputerPartAssignVisitor();

    computer.accept(assignVisitor);

    ReplaceVisitor replaceVisitor = new ReplaceVisitor();

    computer.accept(replaceVisitor);

    ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();

    computer.accept(computerPartDisplayVisitor);

  }

}
