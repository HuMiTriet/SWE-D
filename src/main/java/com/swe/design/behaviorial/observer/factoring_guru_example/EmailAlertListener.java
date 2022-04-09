package com.swe.design.behaviorial.observer.factoring_guru_example;

public class EmailAlertListener extends EventListener {

  public EmailAlertListener(Editor editor) {
    super(editor);
    subject.eventManager.subscribe(this);
  }

  @Override
  public void update() {
    System.out.println("EMAIL received " + subject.getState());
  }

}
