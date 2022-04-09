package com.swe.design.behaviorial.observer.factoring_guru_example;

import java.util.ArrayList;

public class EventManager {
  private ArrayList<EventListener> listeners = new ArrayList<>();

  public void subscribe(EventListener e) {
    listeners.add(e);
  }

  public void unsubscribe(EventListener e) {
    listeners.remove(listeners.indexOf(e));
  }

  public void notifySubscribers() {
    listeners.forEach(listener -> listener.update());
  }

}
