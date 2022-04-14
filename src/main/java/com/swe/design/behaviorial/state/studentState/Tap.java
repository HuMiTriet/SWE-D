package com.swe.design.behaviorial.state.studentState;

public class Tap {
  private int timePressed = 0;
  private boolean capLocked = false;
  // this timePressed variable can have inifite states

  // but in regard to this problem we are sovling there is only 2 relevant state
  public void press(Key key) {

    switch (key) {

      case Q:
        timePressed++;

        if (timePressed % 3 == 1 && capLocked == false) {
          System.out.println(key.toString().toLowerCase());
        } else {
          System.out.println(key.toString().toUpperCase());
        }
        break;

      case CapsLock:
        capLocked = !capLocked;
        break;

      default:
        System.out.println("please press a valid key");
        break;
    }

  }

}
