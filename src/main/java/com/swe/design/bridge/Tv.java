package com.swe.design.bridge;

public class Tv implements Device {
  private boolean isOn;

  @Override
  public void broadcast() {
    System.out.println("I am a " + isOn + " TV");
  }

  @Override
  public void toggleStatus() {
    if (isOn) {
      isOn = false;
    } else {
      isOn = true;
    }
  }

}
