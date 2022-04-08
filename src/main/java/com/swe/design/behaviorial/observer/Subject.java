package com.swe.design.behaviorial.observer;

interface Subject {
  void attach(Observer o);

  void detach(Observer o);

  void execute();

  String getState();

  int getIndex();
}
