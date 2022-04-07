package com.swe.design.observer;

public class ObserverUpper implements Observer {
  private Source source;

  public ObserverUpper(Source source) {
    this.source = source;
    source.attach(this);
  }

  @Override
  public void update() {
    System.out.println("#" + source.getIndex() + " " +
        source.getState().toUpperCase());
  }
}
