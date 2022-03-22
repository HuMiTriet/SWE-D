package com.swe.design;

public class Review {
  public abstract class Shape {
    private String type;

    public String getType() {
      return type;
    }
  }

  public class Circle extends Shape {
    public Circle() {
      super.type = "Circle";
    }
  }

  public class Square extends Shape {
    public Square() {
      super.type = "Square";
    }
  }

  public class Rectangle extends Shape {
    public Rectangle() {
      super.type = "Retangle";
    }
  }

  public class ShapeFactory {
    public Shape getShape(String shapeType) {
      if (shapeType == null) {
        return null;
      }
      if (shapeType.equalsIgnoreCase("CIRCLE")) {
        return new Circle();
      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
        return new Square();
      } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
        return new Rectangle();
      } else
        return null;
    }
  }

  public static void execute() {
    Review r = new Review();
    ShapeFactory shapeFactory = r.new ShapeFactory();
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    Shape shape2 = shapeFactory.getShape("SQUARE");
    Shape shape3 = shapeFactory.getShape("RECTANGLE");
    if (shape1 != null)
      System.out.println(shape1.getType());
    if (shape2 != null)
      System.out.println(shape2.getType());
    if (shape3 != null)
      System.out.println(shape3.getType());
  }
}
