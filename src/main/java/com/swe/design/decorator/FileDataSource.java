package com.swe.design.decorator;

public class FileDataSource implements DataSourceItf {

  @Override
  public void writeData() {
    System.out.println("Writing data");
  }

  @Override
  public void readData() {
    System.out.println("Reading data");
  }

}
