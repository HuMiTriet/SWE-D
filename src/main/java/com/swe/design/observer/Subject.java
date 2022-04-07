package com.swe.design.observer;

interface Subject {
  void attach(Observer o);

  void execute();

  String getState();

  int getIndex();
}
