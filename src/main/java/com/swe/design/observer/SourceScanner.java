package com.swe.design.observer;

import java.util.ArrayList;
import java.util.Scanner;

public class SourceScanner implements Source {
  private String state;
  private int index = 1;
  private ArrayList<Observer> ObserverList = new ArrayList<Observer>();

  @Override
  public void attach(Observer o) {
    ObserverList.add(o);
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter sth: ");

    while (scanner.hasNextLine()) {
      index++;
      state = scanner.nextLine();
      for (Observer o : ObserverList) {
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
