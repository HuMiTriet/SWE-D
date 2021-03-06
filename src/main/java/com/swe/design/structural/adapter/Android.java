package com.swe.design.structural.adapter;

public class Android implements MicroUSB {

  @Override
  public void connectMicroUSB() {
    System.out.println("Connected Micro MicroUSB");
  }

  @Override
  public void rechargeMicroUSB() {
    System.out.println("Charging MircroUSB");
  }
}
