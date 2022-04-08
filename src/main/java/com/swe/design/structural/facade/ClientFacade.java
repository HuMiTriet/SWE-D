package com.swe.design.structural.facade;

public class ClientFacade {
  public static void execute() {
    VideoConverter videoConverter = new LosslessConverter();

    // The client code does not have to care about the subsystem AudioMixer
    // or ImageProcessor works
    videoConverter.convert("video.avi");

  }
}
