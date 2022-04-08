package com.swe.design.structural.bridge;

public class Radio implements Device {
  private boolean isOn = false;

  @Override
  public void broadcast() {
    System.out.println("I am a " + isOn + " RADIO");
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
