package com.swe.design.decorator;

public class ClientDecorator {
  public static void execute() {
    DataSourceItf source = new FileDataSource();

    source = new CompressionDecorator(source);

    source = new EcryptionDecorator(source);

    source.readData();

    source.writeData();
  }
}
