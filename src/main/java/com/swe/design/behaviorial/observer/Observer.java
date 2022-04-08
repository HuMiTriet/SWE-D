package com.swe.design.behaviorial.observer;

/**
 * Observer
 */
abstract class Observer {
  protected Subject subject;

  public Observer(Subject subject) {
    this.subject = subject;
  }

  abstract void update();
}
