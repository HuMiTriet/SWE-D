package com.swe.design.structural.bridge;

public class ClientBridge {
  public static void execute() {

    Tv tv = new Tv();

    RemoteControl remoteControl = new RemoteControl(tv);

    remoteControl.play();

    Radio radio = new Radio();

    remoteControl.setDevice(radio);

    remoteControl.play();

    FancyRemote fancyRemote = new FancyRemote(tv);

    fancyRemote.extraFeature();

    fancyRemote.play();

  }
}
