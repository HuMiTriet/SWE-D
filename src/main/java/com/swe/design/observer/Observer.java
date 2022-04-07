package com.swe.design.observer;

/**
 * Observer
 */
abstract class Observer {
  protected Subject subject;

  public Observer(Subject subject) {
    this.subject = subject;
  }

  void update() {
  };
}
