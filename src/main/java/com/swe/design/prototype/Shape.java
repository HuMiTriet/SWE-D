package com.swe.design.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
