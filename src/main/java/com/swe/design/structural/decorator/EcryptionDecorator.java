package com.swe.design.structural.decorator;

public class EcryptionDecorator extends DecoratorAbs {

  public EcryptionDecorator(DataSourceItf wrappee) {
    super(wrappee);
  }

  @Override
  public void writeData() {
    System.out.println("Encrypting data");
    super.writeData();
  }

  @Override
  public void readData() {
    System.out.println("De-crypting data");
    super.readData();
  }

}
