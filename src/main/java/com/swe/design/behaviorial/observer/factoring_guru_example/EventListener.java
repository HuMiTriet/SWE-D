package com.swe.design.behaviorial.observer.factoring_guru_example;

abstract class EventListener {
  protected Editor subject;

  public EventListener(Editor editor) {
    this.subject = editor;
  }

  abstract void update();
}
