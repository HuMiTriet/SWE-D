package com.swe.design.observer;

public class ClientObserver {
  public static void execcute() {
    Source source = new SourceScanner();

    Observer upper = new ObserverUpper(source);

    source.execute();

  }
}
