package com.swe.design.iterator;

public class ClientIterator {

  public static void execute() {

    NameRepository nameRepository = new NameRepository();
    Iterator nameItr = nameRepository.getIterator();

    while (nameItr.hasNext()) {
      if (nameItr.next().equals("B")) {
        System.out.println("B is in the list");
        break;
      }
    }

    System.out.println("--------------------------------------------------------------------------------");

    Iterator orderedIterator = nameRepository.getOrderedIterator();

    while (orderedIterator.hasNext()) {
      System.out.println(orderedIterator.next());
    }

    System.out.println("--------------------------------------------------------------------------------");

    if (orderedIterator.hasNext()) {
      System.out.println(orderedIterator.next());
    }

  }

}
