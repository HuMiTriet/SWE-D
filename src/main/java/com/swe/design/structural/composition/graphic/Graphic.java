package com.swe.design.structural.composition.graphic;

/**
 * Graphic
 */
public interface Graphic {
  public void draw();

  public void move(Point point);

  public float calculateCircumference();
}
