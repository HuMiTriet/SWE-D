package com.swe.design.composition.graphic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Graphic {
  private Point center;
  private int radius;

  @Override
  public void move(Point point) {
    center.setX(center.getX() + point.getX());
    center.setY(center.getY() + point.getY());
  }

  @Override
  public void draw() {
    System.out.printf("Circle: X: %d Y: %d \n", center.getX(), center.getY());
  }

  @Override
  public float calculateCircumference() {
    return 2 * this.radius * 3.14f;
  }

}
