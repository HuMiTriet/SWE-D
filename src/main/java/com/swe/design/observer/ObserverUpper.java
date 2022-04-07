package com.swe.design.observer;

public class ObserverUpper extends Observer {

  ObserverUpper(Subject subject) {
    super(subject);
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("#" + subject.getIndex() + " " +
        subject.getState().toUpperCase());
  }
}
