package com.swe.design.behaviorial.state;

public class FunctionState implements State {

  @Override
  public void tap(Keyboard keyboard, Key key) {
    switch (key) {
      case F11:
        System.out.println("At F11 VOLUME DOWN");
        break;

      case F12:
        System.out.println("At F11 VOLUME Up");
        break;

      default:
        break;
    }

  }

  @Override
  public void hold(Keyboard keyboard, Key key) {
    switch (key) {
      case Shift:
        keyboard.currentState = new FunctionShiftState();
        break;

      default:
        break;
    }
  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {

    switch (key) {

      case Fn:
        keyboard.currentState = new InitialState();
        break;

      default:
        break;
    }
  }

}
