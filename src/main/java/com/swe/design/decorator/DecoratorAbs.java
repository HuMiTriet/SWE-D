package com.swe.design.decorator;

abstract class DecoratorAbs implements DataSourceItf {
  private DataSourceItf wrappee;

  DecoratorAbs(DataSourceItf wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public void writeData() {
    wrappee.writeData();
  }

  @Override
  public void readData() {
    wrappee.readData();
  }

}
