package com.swe.design.observer;

interface Source {
  void attach(Observer o);

  void execute();

  String getState();

  int getIndex();
}
