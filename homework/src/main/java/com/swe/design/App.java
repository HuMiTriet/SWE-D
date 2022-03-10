package com.swe.design;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class App {

  @Getter
  @Setter
  public class OrderItem {
    private String orderType;
    private String name;
    private float price;
  }

  public class ChickenBurger extends OrderItem {
    public ChickenBurger() {
      super.setOrderType("main dish");
      super.setName("chicken burger");
      super.setPrice(50);
    }
  }

  public class VeggieBurger extends OrderItem {
    public VeggieBurger() {
      super.setOrderType("main dish");
      super.setName("veggie burger");
      super.setPrice(25);
    }
  }

  public class Coke extends OrderItem {
    public Coke() {
      super.setOrderType("beverage");
      super.setName("coke");
      super.setPrice(10);
    }
  }

  public class Pepsi extends OrderItem {
    public Pepsi() {
      super.setOrderType("beverage");
      super.setName("Pepsi");
      super.setPrice(12);
    }
  }

  public class Flan extends OrderItem {
    public Flan() {
      super.setOrderType("dessert");
      super.setName("flan");
      super.setPrice(10);
    }
  }

  public class Fruit extends OrderItem {
    public Fruit() {
      super.setOrderType("dessert");
      super.setName("fruit");
      super.setPrice(10);
    }
  }

  public class Register {
    public ArrayList<OrderItem> bill = new ArrayList<OrderItem>();

    public void addItem(String name) {
      switch (name) {
        case "veggie":
          this.bill.add(new VeggieBurger());
          break;
        case "chicken":
          this.bill.add(new ChickenBurger());
          break;
        case "coke":
          this.bill.add(new Coke());
          break;
        case "pepsi":
          this.bill.add(new Pepsi());
          break;
        case "flan":
          this.bill.add(new Flan());
          break;
        case "fruit":
          this.bill.add(new Fruit());
          break;
        default:
          System.out.println("no item matches with the name");
      }
    }

    public void printOrder() {
      ArrayList<OrderItem> mainDish = new ArrayList<>();
      ArrayList<OrderItem> beverage = new ArrayList<>();
      ArrayList<OrderItem> dessert = new ArrayList<>();
      int totalPrice = 0;

      for (int i = 0; i < bill.size(); i++) {
        switch (bill.get(i).getOrderType()) {
          case "main dish":
            mainDish.add(bill.get(i));
            break;
          case "beverage":
            beverage.add(bill.get(i));
            break;
          case "dessert":
            dessert.add(bill.get(i));
            break;
        }
      }

      System.out.println("The main dish include: ");
      for (OrderItem orderItem : mainDish) {
        System.out.println(orderItem.getName() + "    " + orderItem.getPrice());
        totalPrice += orderItem.getPrice();
      }

      System.out.println("The beverage include: ");
      for (OrderItem orderItem : beverage) {
        System.out.println(orderItem.getName() + "    " + orderItem.getPrice());
        totalPrice += orderItem.getPrice();
      }

      System.out.println("The dessert include: ");
      for (OrderItem orderItem : dessert) {
        System.out.println(orderItem.getName() + "    " + orderItem.getPrice());
        totalPrice += orderItem.getPrice();
      }

      System.out.println("The total price is: " + totalPrice);
    }

  }

  public static void main(String[] args) {
    App a = new App();
    Register reg = a.new Register();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to our restaurant");
    System.out.println("what do you want in your meal ? press q to quit");

    while (true) {
      String userInput = scanner.nextLine();
      if (userInput.equals("q")) {
        scanner.close();
        break;
      } else {
        reg.addItem(userInput);
      }
    }

    reg.printOrder();
  }
}
