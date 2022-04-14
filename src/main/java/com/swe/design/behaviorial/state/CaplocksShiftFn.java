package com.swe.design.behaviorial.state;

public class CaplocksShiftFn implements State {
  @Override
  public void tap(Keyboard keyboard, Key key) {
    switch (key) {
      case F11:
        System.out.println("VOLUME DOWN");
        break;

      case F12:
        System.out.println("VOLUME UP");
        break;

      default:
        System.out.println("INVALID KEY");
        break;
    }
  }

  @Override
  public void hold(Keyboard keyboard, Key key) {

  }

  @Override
  public void unhold(Keyboard keyboard, Key key) {

  }
}
