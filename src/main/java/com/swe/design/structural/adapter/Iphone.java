package com.swe.design.structural.adapter;

public class Iphone implements Lightning {
  @Override
  public void connectLightning() {
    System.out.println("Connected Lightning");
  }

  @Override
  public void chargeLightning() {
    System.out.println("charging Lightning");
  }

}
