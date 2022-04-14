package com.swe.design.behaviorial.state;

public class ShiftState implements State {
  @Override
  public void tap(Keyboard keyboard, Key key) {
    if (key != Key.CapLocks) {
      System.out.println(key.toString().toUpperCase());
    } else {
      keyboard.currentState = new InitialState();
    }

  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    switch (key) {
      case Fn:
        keyboard.currentState = new FunctionShiftState();
        break;

      default:
        System.out.println("holding " + key.toString().toUpperCase());
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
