package com.swe.design.observer;

public class ClientObserver {
  public static void execcute() {
    Subject source = new SubjectScanner();

    Observer upper = new ObserverUpper(source);

    source.execute();

  }
}
