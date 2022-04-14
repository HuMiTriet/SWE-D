package com.swe.design.behaviorial.state;

public class CaplockShift implements State {
  @Override
  public void tap(Keyboard keyboard, Key key) {
    // TODO Auto-generated method stub

  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    switch (key) {
      case Fn:
        keyboard.currentState = new CaplocksShiftFn();
        break;

      default:
        break;
    }

  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {
    // TODO Auto-generated method stub

  }
}
