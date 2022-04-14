package com.swe.design.behaviorial.state;

public class CaplocksFnState implements State {

  @Override
  public void tap(Keyboard keyboard, Key key) {
    switch (key) {
      case F11:
        System.out.println("LUMINOUSITY DOWN");
        break;

      case F12:
        System.out.println("LUMINOUSITY UP");
        break;

      default:
        break;
    }

  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    // TODO Auto-generated method stub

  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {
    switch (key) {
      case Fn:
        keyboard.currentState = new CaplockState();
        break;

      default:
        break;
    }
  }
}
