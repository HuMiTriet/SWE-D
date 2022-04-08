package com.swe.design.behaviorial.observer.factoring_guru_example;

public class LoggingListenter implements EventListener {

  @Override
  public void update() {
    System.out.println("LOGGED IN new user");
  }

}
