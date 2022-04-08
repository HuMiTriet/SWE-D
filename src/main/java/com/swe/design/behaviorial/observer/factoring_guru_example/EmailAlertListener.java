package com.swe.design.behaviorial.observer.factoring_guru_example;

public class EmailAlertListener implements EventListener {

  @Override
  public void update() {
    System.out.println("EMAIL received");
  }

}
