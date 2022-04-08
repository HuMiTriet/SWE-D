package com.swe.design.behaviorial.observer;

public class ClientObserver {
  public static void execcute() {
    Subject source = new SubjectScanner();

    Observer upper = new ObserverUpper(source);

    Observer upper2 = new ObserverUpper(source);

    source.execute();

    source.detach(upper);

    source.execute();

  }
}
