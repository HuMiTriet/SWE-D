package com.swe.design.structural.adapter;

public class MicroUsbToLightningAdapter implements Lightning {
  private MicroUSB microUSB = null;

  MicroUsbToLightningAdapter(MicroUSB microUSB) {
    this.microUSB = microUSB;
  }

  @Override
  public void connectLightning() {
    this.microUSB.connectMicroUSB();
  }

  @Override
  public void chargeLightning() {
    this.microUSB.rechargeMicroUSB();
  }
}
