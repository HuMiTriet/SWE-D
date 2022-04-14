package com.swe.design.behaviorial.state;

public class InitialState implements State {
  @Override
  public void tap(Keyboard keyboard, Key key) {
    if (key == Key.CapLocks) {
      keyboard.currentState = new CaplockState();
    } else {
      System.out.println("q");
    }
  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    if (key == Key.Shift) {
      keyboard.currentState = new ShiftState();
    }
  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {
    if (key == Key.Shift) {
      keyboard.currentState = new InitialState();
    }
  }
}
