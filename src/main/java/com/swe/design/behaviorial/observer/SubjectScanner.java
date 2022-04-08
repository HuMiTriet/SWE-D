package com.swe.design.behaviorial.observer;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectScanner implements Subject {
  private String state;
  private int index = 1;
  private ArrayList<Observer> observerList = new ArrayList<Observer>();

  @Override
  public void attach(Observer o) {
    observerList.add(o);
  }

  @Override
  public void detach(Observer o) {
    observerList.remove(observerList.indexOf(o));
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter sth: (press quit to quit) ");

    while (scanner.hasNextLine()) {
      index++;
      state = scanner.nextLine();
      if (state.equalsIgnoreCase("quit")) {
        break;
      }
      for (Observer o : observerList) {
        o.update();
      }
    }

    scanner.close();
  }

  @Override
  public String getState() {
    return this.state;
  }

  @Override
  public int getIndex() {
    return this.index;
  }
}
