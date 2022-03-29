package com.swe.design.composition;

public class ClientWip {
  public static void execute() {
    Employee president = new Employee();
    president.setName("John");

    Employee dean = new Employee();
    dean.setName("Mary");

    Employee lecturer = new Employee();
    lecturer.setName("Peter");

    Employee assistant = new Employee();
    assistant.setName("Paul");

    president.add(dean);
    dean.add(lecturer);
    dean.add(assistant);

    president.printSubordinate();

  }
}
