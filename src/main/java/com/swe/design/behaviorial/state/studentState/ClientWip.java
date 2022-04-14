package com.swe.design.behaviorial.state.studentState;

//build a tap class with a method that take in the enum class Key that print out
// q Q Q q pattern
public class ClientWip {
  public static void execute(String[] args) {
    Tap tap = new Tap();

    tap.press(Key.Q); // low
    tap.press(Key.Q);
    tap.press(Key.Q);
    tap.press(Key.Q); //

    System.out.println("--------------------------------------------------------------------------------");

    tap.press(Key.CapsLock);

    tap.press(Key.Q);
    tap.press(Key.Q);
    tap.press(Key.Q); //

    tap.press(Key.CapsLock);

    tap.press(Key.Q);
    tap.press(Key.Q);
    tap.press(Key.Q); //

  }
}
