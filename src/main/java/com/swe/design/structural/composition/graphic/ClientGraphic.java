package com.swe.design.structural.composition.graphic;

public class ClientGraphic {
  public static void execute() {

    CompositeGraphic compositeGraphic = new CompositeGraphic();

    CompositeGraphic subGraphic = new CompositeGraphic();

    Point center = new Point(1, 1);
    Point center2 = new Point(1, 1);
    Circle circleOne = new Circle(center, 2);

    Circle circleTwo = new Circle(center2, 3);

    compositeGraphic.addGraphic(circleOne);

    compositeGraphic.addGraphic(subGraphic);

    subGraphic.addGraphic(circleTwo);

    compositeGraphic.move(new Point(1, 1));
    compositeGraphic.draw();
    System.out.println(compositeGraphic.calculateCircumference());

  }
}
