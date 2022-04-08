package com.swe.design.structural.adapter;

public class Client {
  private static void useMicroUSB(MicroUSB microUSB) {
    microUSB.connectMicroUSB();
    microUSB.rechargeMicroUSB();
  }

  private static void useLightning(Lightning lightning) {
    lightning.connectLightning();
    lightning.chargeLightning();
  }

  public static void execute() {
    Iphone iphone = new Iphone();
    Android android = new Android();

    useMicroUSB(android);

    System.out.println("--------------------------------------------------------------------------------");
    useMicroUSB(new LightningToMicroUsbAdapter(iphone));

    System.out.println("--------------------------------------------------------------------------------");
    useLightning(new MicroUsbToLightningAdapter(android));

  }
}
