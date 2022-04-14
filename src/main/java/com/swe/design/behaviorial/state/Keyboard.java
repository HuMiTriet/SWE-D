package com.swe.design.behaviorial.state;

public class Keyboard {
  public State currentState = new InitialState();

  public void tap(Key key) {
    currentState.tap(this, key);
  }

  public void hold(Key key) {
    currentState.hold(this, key);
  }

  public void unhold(Key key) {
    currentState.unhold(this, key);
  }

}
