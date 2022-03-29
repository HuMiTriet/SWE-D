package com.swe.design.composition.graphic;

import java.util.ArrayList;

public class CompositeGraphic implements Graphic {
  ArrayList<Graphic> graphics = new ArrayList<>();

  @Override
  public void move(Point point) {
    for (Graphic graphic : graphics) {
      graphic.move(point);
    }
  }

  @Override
  public void draw() {
    for (Graphic graphic : graphics) {
      graphic.draw();
    }
  }

  @Override
  public float calculateCircumference() {
    float sum = 0;
    for (Graphic graphic : graphics) {
      sum += graphic.calculateCircumference();
    }
    return sum;
  }

  public void addGraphic(Graphic graphic) {
    graphics.add(graphic);
  }

}
