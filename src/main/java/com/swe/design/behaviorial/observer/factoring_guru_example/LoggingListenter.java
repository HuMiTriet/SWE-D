package com.swe.design.behaviorial.observer.factoring_guru_example;

public class LoggingListenter extends EventListener {

  public LoggingListenter(Editor editor) {
    super(editor);
    subject.eventManager.subscribe(this);
  }

  @Override
  public void update() {
    System.out.println("LOGGED IN new user " + subject.getState());
  }

}
