package com.swe.design.behaviorial.state;

public class ClientState {
  public static void execute() {
    Keyboard keyboard = new Keyboard();

    keyboard.tap(Key.Q);

    keyboard.tap(Key.CapLocks);

    keyboard.tap(Key.Q);

    keyboard.tap(Key.CapLocks);

    keyboard.tap(Key.Q);

    System.out.println("--------------------------------------------------------------------------------");

    keyboard.tap(Key.Q); // ini

    keyboard.hold(Key.Shift); // Shift

    keyboard.tap(Key.Q); // shift

    keyboard.unhold(Key.Shift); // ini

    keyboard.tap(Key.Q); // ini
  }
}
