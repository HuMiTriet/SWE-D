package com.swe.design.decorator;

public class CompressionDecorator extends DecoratorAbs {

  public CompressionDecorator(DataSourceItf wrappee) {
    super(wrappee);
  }

  @Override
  public void writeData() {
    System.out.println("Comrpressing data");
    super.writeData();
  }

  @Override
  public void readData() {
    System.out.println("De-comrpressing data");
    super.readData();
  }
}
