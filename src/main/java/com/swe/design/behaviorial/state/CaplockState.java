package com.swe.design.behaviorial.state;

public class CaplockState implements State {

  @Override
  public void tap(Keyboard keyboard, Key key) {

    if (key == Key.CapLocks) {
      keyboard.currentState = new InitialState();
    } else {
      System.out.println("Q");
    }

  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    switch (key) {
      case Shift:

        break;

      case Fn:
        keyboard.currentState = new CaplocksFnState();
        break;

      default:
        break;
    }
  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {

  }

}
