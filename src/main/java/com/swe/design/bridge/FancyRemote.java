package com.swe.design.bridge;

public class FancyRemote extends RemoteControl {
  public FancyRemote(Device device) {
    super(device);
  }

  public void extraFeature() {
    device.toggleStatus();
    System.out.println("Doing extra stuff");
  }
}
