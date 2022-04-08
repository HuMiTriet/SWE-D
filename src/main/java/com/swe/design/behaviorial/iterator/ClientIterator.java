package com.swe.design.behaviorial.iterator;

public class ClientIterator {

  public static void execute() {

    ItertableCollection nameRepository = new NameRepository();
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

    orderedIterator = nameRepository.getOrderedIterator();

    // If we only want to get the first element
    if (orderedIterator.hasNext()) {
      System.out.println(orderedIterator.next());
    }

  }

}
