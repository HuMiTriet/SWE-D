package com.swe.design.factory;

public class ExcerciseOne {

  public interface Printer {
    public void print();
  }

  public class PrinterOne implements Printer {
    @Override
    public void print() {
      System.out.println("This is printer ONE");
    }
  }

  public class PrinterTwo implements Printer {
    @Override
    public void print() {
      System.out.println("This is printer TWO");
    }
  }

  public class Factory {
    public Printer createPrinterDriver(int type) {
      Printer result = null;
      switch (type) {
        case 1:
          result = new PrinterOne();
          break;
        case 2:
          result = new PrinterTwo();
          break;
        default:
          System.out.println("Please enter a correct number");
          break;
      }
      return result;
    }
  }

  public static void execute() {

    ExcerciseOne p = new ExcerciseOne();

    Factory factory = p.new Factory();

    Printer printer1 = factory.createPrinterDriver(1);
    printer1.print();

    Printer printer2 = factory.createPrinterDriver(2);
    printer2.print();

    Printer printer3 = factory.createPrinterDriver(3);
  }

}
