package com.swe.design.builder;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseThree {

  abstract class Item {
    public String name;
    public float price;

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
    public ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
      this.items.add(item);
    }

    public void showItems() {
      System.out.println("--------------------------------------------------------------------------------");
      for (Item item : this.items) {
        System.out.print("Item: " + item.getName() + " Price: " + item.getPrice() + "\n");
      }
    }

    public float getTotalPrice() {
      float totalPrice = 0;
      for (int i = 0; i < this.items.size(); i++) {
        totalPrice += this.items.get(i).getPrice();
      }
      return totalPrice;
    }

  }

  interface Builder {
    public void reset();

    public void addMainDish();

    public void addBeverage();

    public void addDessert();

    public Meal getResult();
  }

  public class OneMainBuilder implements Builder {
    private boolean mainDishAdded = false;
    private boolean beverageAdded = false;
    private boolean dessertAdded = false;

    private Meal meal = null;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void reset() {
      this.meal = new Meal();
    }

    public OneMainBuilder() {
      this.reset();
    }

    @Override
    public Meal getResult() {
      if (this.mainDishAdded && this.beverageAdded && this.dessertAdded)
        return this.meal;
      else
        return null;
    }

    @Override
    public void addMainDish() {
      System.out.println("Please select a main dish: ");
      System.out.println("1. Chicken Burger");
      System.out.println("2. Veggie Burger");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          this.meal.addItem(new ChickenBurger());
          this.mainDishAdded = true;
          break;
        case 2:
          this.meal.addItem(new VeggieBurger());
          this.mainDishAdded = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }

    @Override
    public void addDessert() {
      System.out.println("Please select a dessert: ");
      System.out.println("1. Flan");
      System.out.println("2. Fruit");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          this.meal.addItem(new Flan());
          this.dessertAdded = true;
          break;
        case 2:
          this.meal.addItem(new Fruit());
          this.dessertAdded = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }

    @Override
    public void addBeverage() {
      System.out.println("Please select a beverage: ");
      System.out.println("1. Coke");
      System.out.println("2. Pepsi");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          this.meal.addItem(new Coke());
          this.beverageAdded = true;
          break;
        case 2:
          this.meal.addItem(new Pepsi());
          this.beverageAdded = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }

  }

  public static void execute() {
    ExerciseThree exerciseThree = new ExerciseThree();
    Builder builder = exerciseThree.new OneMainBuilder();

    builder.addMainDish();
    builder.addBeverage();
    builder.addDessert();

    Meal meal = builder.getResult();

    if (meal != null) {
      meal.showItems();
      System.out.println("Total Price: " + meal.getTotalPrice());
    } else {
      System.out.println("Invalid meal");
    }

  }
}
