package com.swe.design.structural.bridge;

/**
 * The terms implemenation (platform) and abstraction (interface) here means the
 * implementation class or the abstract class respectively but the terms
 * proposed by the GoF
 * 
 * This is the abstraction that the client will be working with. the Client is
 * responsibe for passing the correct implementation object into abstraction
 * but are not concern with how each operations are implemented.
 * 
 * The abstraction define high-level operations to the Client but delegate all
 * of the acutal work to the implementation that it has referenced inside
 */
public class RemoteControl {

  protected Device device = null;

  public RemoteControl(Device device) {
    this.device = device;
  }

  public void play() {

    device.toggleStatus();

    device.broadcast();
  }

  public void setDevice(Device device) {
    this.device = device;
  }

}
