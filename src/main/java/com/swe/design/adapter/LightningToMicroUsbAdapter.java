package com.swe.design.adapter;

public class LightningToMicroUsbAdapter implements MicroUSB {

  private Lightning lightning = null;

  LightningToMicroUsbAdapter(Lightning lightning) {
    this.lightning = lightning;
  }

  @Override
  public void connectMicroUSB() {
    this.lightning.connectLightning();
  }

  @Override
  public void rechargeMicroUSB() {
    this.lightning.chargeLightning();
  }
}
