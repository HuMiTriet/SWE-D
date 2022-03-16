package com.swe.design.builder;

import java.util.Scanner;

public class ExerciseTwo {

  abstract class Item {
    public String name = "NAN";
    public float price = Float.NaN;

    public String getName() {
      return this.name;
    };

    public float getPrice() {
      return this.price;
    };
  }

  public class ChickenBurger extends Item {
    public ChickenBurger() {
      this.name = "Chicken Burger";
      this.price = 50f;
    }
  }

  public class VeggieBurger extends Item {
    public VeggieBurger() {
      this.name = "Veggie Burger";
      this.price = 25f;
    }
  }

  public class Coke extends Item {
    public Coke() {
      this.name = "Coke";
      this.price = 10f;
    }
  }

  public class Pepsi extends Item {
    public Pepsi() {
      this.name = "Pepsi";
      this.price = 12f;
    }
  }

  public class Flan extends Item {
    public Flan() {
      this.name = "Flan";
      this.price = 10f;
    }
  }

  public class Fruit extends Item {
    public Fruit() {
      this.name = "Fruit";
      this.price = 10f;
    }
  }

  public class Meal {

  }

  interface Builder {
    public void reset();

    public void addMainDish();

    public void addBeverage();

    public void addDessert();

    public Meal getResult();
  }

  public class OneMainBuilder implements Builder {
    private Meal meal = null;
    Scanner scanner = new Scanner(System.in);

    public OneMainBuilder() {
      this.reset();
    }

    @Override
    public void reset() {
      this.meal = new Meal();
    }

    @Override
    public void addMainDish() {

    }

    @Override
    public void addDessert() {

    }

    @Override
    public void addBeverage() {

    }

    @Override
    public Meal getResult() {
      this.reset();
      return this.meal;
    }

  }

  public static void execute() {
  }
}
