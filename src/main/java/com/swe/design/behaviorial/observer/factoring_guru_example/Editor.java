package com.swe.design.behaviorial.observer.factoring_guru_example;

import java.util.Scanner;

public class Editor {
  EventManager eventManager = new EventManager();
  private String state;

  public String getState() {
    return this.state;
  }

  public void execute() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your message");
    while (scanner.hasNextLine()) {
      state = scanner.nextLine();
      eventManager.notifySubscribers();
    }

    scanner.close();
  }

}
