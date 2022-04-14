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
    if (key == Key.Shift) {
      keyboard.currentState = new InitialState();
    }
  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {

  }

}
