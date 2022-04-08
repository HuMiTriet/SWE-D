package com.swe.design.creational.builder;

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

    public void setPrice(float price) {
      this.price = price;
    }
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

    public Meal getResult();
  }

  public class OneMainBuilder implements Builder {
    private boolean mainDishAdded = false;
    private boolean beverageAdded = false;

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
      if (this.mainDishAdded && this.beverageAdded)
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

  public class NoSaltOneMainBuilder implements Builder {
    private boolean mainDishAdded = false;
    private boolean beverageAdded = false;

    private Meal meal = null;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void reset() {
      this.mainDishAdded = false;
      this.beverageAdded = false;
      this.meal = new Meal();
    }

    public NoSaltOneMainBuilder() {
      this.reset();
    }

    @Override
    public Meal getResult() {
      if (this.mainDishAdded && this.beverageAdded)
        return this.meal;
      else
        return null;
    }

    @Override
    public void addMainDish() {
      System.out.println("Please select a Salty main dish: ");
      System.out.println("1. Chicken Burger");
      System.out.println("2. Veggie Burger");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          Item chicken = new ChickenBurger();
          chicken.setPrice(chicken.getPrice() * 0.9f);
          this.meal.addItem(chicken);
          this.mainDishAdded = true;
          break;
        case 2:
          Item Veggie = new VeggieBurger();
          Veggie.setPrice(Veggie.getPrice() * 0.9f);
          this.meal.addItem(Veggie);
          this.mainDishAdded = true;
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

  public class TwoMainBuilder implements Builder {
    private boolean mainDishAdded = false;
    private boolean secondMainDishAdded = false;
    private boolean beverageAdded = false;
    Scanner scanner = new Scanner(System.in);

    Meal meal = null;

    @Override
    public void reset() {
      this.mainDishAdded = false;
      this.secondMainDishAdded = false;
      this.beverageAdded = false;
      this.meal = new Meal();
    }

    public TwoMainBuilder() {
      this.reset();
    }

    @Override
    public void addMainDish() {
      System.out.println("Please select the FIRST main dish: ");
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

      System.out.println("Please select the Second main dish: ");
      System.out.println("1. Chicken Burger");
      System.out.println("2. Veggie Burger");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          this.meal.addItem(new ChickenBurger());
          this.secondMainDishAdded = true;
          break;
        case 2:
          this.meal.addItem(new VeggieBurger());
          this.secondMainDishAdded = true;
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

    @Override
    public Meal getResult() {
      if (this.mainDishAdded && this.secondMainDishAdded && this.beverageAdded)
        return this.meal;
      else
        return null;
    }
  }

  public static void execute() {
    ExerciseThree exerciseThree = new ExerciseThree();
    Builder builder = exerciseThree.new OneMainBuilder();

    builder.addMainDish();
    builder.addBeverage();

    Meal meal = builder.getResult();

    if (meal != null) {
      meal.showItems();
      System.out.println("Total Price: " + meal.getTotalPrice());
    } else {
      System.out.println("Invalid meal");
    }

    System.out.println("--------------------------------------------------------------------------------");

    builder.reset();

    builder = exerciseThree.new NoSaltOneMainBuilder();

    builder.addMainDish();
    builder.addBeverage();

    meal = builder.getResult();

    if (meal != null) {
      meal.showItems();
      System.out.println("Total Price: " + meal.getTotalPrice());
    } else {
      System.out.println("Invalid meal");
    }

    System.out.println("--------------------------------------------------------------------------------");

    builder.reset();

    builder = exerciseThree.new TwoMainBuilder();

    builder.addMainDish();
    builder.addBeverage();

    meal = builder.getResult();

    if (meal != null) {
      meal.showItems();
      System.out.println("Total Price: " + meal.getTotalPrice());
    } else {
      System.out.println("Invalid meal");
    }
  }
}
