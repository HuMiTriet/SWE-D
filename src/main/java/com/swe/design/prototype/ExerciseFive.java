package com.swe.design.prototype;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ExerciseFive {
  @Getter
  @Setter
  @NoArgsConstructor
  public abstract class Shape {
    private int x;
    private int y;

    public Shape(Shape source) {
      if (source != null) {
        this.x = source.x;
        this.y = source.y;
      }
    }

    public abstract Shape clone();
  }

  @Getter
  @Setter
  @NoArgsConstructor
  public class Circle extends Shape {
    private int radius;

    // question: Why use the clone method when we can just use this constructor?
    public Circle(Circle source) {
      super(source);
      if (source != null) {
        this.radius = source.getRadius();
      }
    }

    @Override
    public Shape clone() {
      return new Circle(this);
    }
  }

  public class Registry {
    private Map<String, Shape> cache = new HashMap<>();

    public void putShape(String key, Shape shape) {
      this.cache.put(key, shape);
    }

    public Shape getShape(String key) {
      return this.cache.get(key).clone();
    }
  }

  public static void execute() {
    ExerciseFive ef = new ExerciseFive();
    Circle circleOne = ef.new Circle();

    circleOne.setX(1);
    circleOne.setY(2);
    circleOne.setRadius(3);

    Circle circleTwo = (Circle) circleOne.clone();

    circleTwo.setX(4);
    circleTwo.setY(5);
    circleTwo.setRadius(6);

    Registry registry = ef.new Registry();

    registry.putShape("CircleOne", circleOne);
    registry.putShape("CircleTwo", circleTwo);

    Circle testOne = (Circle) registry.getShape("CircleOne").clone();

    System.out.println(testOne.getX());
    System.out.println(testOne.getY());
    System.out.println(testOne.getRadius());

    System.out.println("--------------------------------------------------------------------------------");
    Circle testTwo = (Circle) registry.getShape("CircleTwo").clone();

    System.out.println(testTwo.getX());
    System.out.println(testTwo.getY());
    System.out.println(testTwo.getRadius());
  }
}
