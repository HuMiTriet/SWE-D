package com.swe.design;

import java.util.HashMap;
import java.util.Map;

public class Review {
  public abstract class Shape {
    private String type;

    public Shape() {
    }

    public Shape(Shape source) {
      if (source != null) {
        this.type = source.type;
      }
    }

    public abstract Shape clone();

    public String getType() {
      return type;
    }

  }

  public class Circle extends Shape {

    public Circle() {
      System.out.println("Very expensive");
      super.type = "circle";
    }

    public Circle(Circle source) {
      super(source);
    }

    @Override
    public Shape clone() {
      return new Circle(this);
    }
  }

  public class Square extends Shape {
    public Square() {
      System.out.println("Very expensive");
      super.type = "square";
    }

    public Square(Square source) {
      super(source);
    }

    @Override
    public Shape clone() {
      return new Square(this);
    }
  }

  public class Rectangle extends Shape {
    public Rectangle() {
      System.out.println("Very expensive");
      super.type = "rectangle";
    }

    public Rectangle(Rectangle source) {
      super(source);
    }

    @Override
    public Shape clone() {
      return new Rectangle(this);
    }
  }

  public class Retristry {
    private Map<String, Shape> cache = new HashMap<>();

    public void loadCache() {
      this.cache.put("circle", new Circle());
      this.cache.put("square", new Square());
      this.cache.put("rectangle", new Rectangle());
    }

    public void putShape(String key, Shape shape) {
      this.cache.put(key, shape);
    }

    public Shape getShape(String key) {
      return this.cache.get(key).clone();
    }
  }

  public static void execute() {
    Review r = new Review();
    Retristry retristry = r.new Retristry();
    retristry.loadCache();

    Shape circle = retristry.getShape("circle");
    System.out.println(circle.getType());

    Shape square = retristry.getShape("square");
    System.out.println(square.getType());

    Shape rectangle = retristry.getShape("rectangle");
    System.out.println(rectangle.getType());

    Shape rectangle2 = retristry.getShape("rectangle");
    System.out.println(rectangle2.getType());
  }
}
