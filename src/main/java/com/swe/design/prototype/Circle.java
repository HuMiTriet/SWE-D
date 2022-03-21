package com.swe.design.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Circle extends Shape {
  private int radius;

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
