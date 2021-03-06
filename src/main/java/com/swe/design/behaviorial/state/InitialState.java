package com.swe.design.behaviorial.state;

public class InitialState implements State {
  @Override
  public void tap(Keyboard keyboard, Key key) {
    switch (key) {
      case CapLocks:
        keyboard.currentState = new CaplockState();
        break;

      default:
        System.out.println("q");
        break;
    }
  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    switch (key) {
      case Fn:
        keyboard.currentState = new CaplockShift();
        break;

      case Shift:
        keyboard.currentState = new ShiftState();
        break;

      default:
        break;
    }
  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {
    if (key == Key.Shift) {
      keyboard.currentState = new InitialState();
    }
  }
}
