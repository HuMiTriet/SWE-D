package com.swe.design.behaviorial.state;

public class ClientState {
  public static void execute() {
    Keyboard keyboard = new Keyboard();

    keyboard.hold(Key.Fn);

    keyboard.tap(Key.F11);

    keyboard.tap(Key.F12);

    keyboard.unhold(Key.Fn);

    keyboard.tap(Key.F12);

    System.out.println("--------------------------------------------------------------------------------");

    keyboard.hold(Key.Fn);

    keyboard.hold(Key.Shift);

    keyboard.tap(Key.F11);

    keyboard.tap(Key.F12);

    keyboard.unhold(Key.Fn);

    keyboard.unhold(Key.Shift);

    keyboard.tap(Key.F12);

    System.out.println("--------------------------------------------------------------------------------");

    keyboard.tap(Key.CapLocks);

    keyboard.hold(Key.Fn);

    keyboard.tap(Key.F11);

    keyboard.tap(Key.F12);

    keyboard.unhold(Key.Fn);

    keyboard.tap(Key.CapLocks);

    keyboard.tap(Key.F12);

    System.out.println("--------------------------------------------------------------------------------");

    keyboard.tap(Key.CapLocks);

    keyboard.hold(Key.Shift);

    keyboard.hold(Key.Fn);

    keyboard.tap(Key.F11);

    keyboard.tap(Key.F12);

  }

}
