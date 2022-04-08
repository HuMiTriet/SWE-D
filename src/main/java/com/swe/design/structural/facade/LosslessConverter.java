package com.swe.design.structural.facade;

public class LosslessConverter implements VideoConverter {
  @Override
  public void convert(String fileName) {
    ImageProcessor imageProcessor = new ImageProcessor();
    AudioMixer audioMixer = new AudioMixer();

    imageProcessor.processImage(fileName);
    audioMixer.mix(fileName);

    System.out.println("Converting " + fileName + " to lossless format");
  }
}
