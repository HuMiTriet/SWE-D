package com.swe.design.wip;

public class ClientWip {
  public static void execute() {

    StudentArchive archive = new StudentArchive();
    archive.printLeftToRight();
    archive.printRightToLeft();

    System.out.println("--------------------------------------------------------------------------------");

    Branch branch = new Branch("A");
    Branch branch2 = new Branch("B");
    Branch branch3 = new Branch("C");

    Leaf leaf = new Leaf("D");

    branch.addLeft(branch2);
    branch.addRight(branch3);

    branch2.addLeft(leaf);

    branch.print();

    System.out.println("--------------------------------------------------------------------------------");

    // Printing first and last element on the list
    archive.printPosition(0);
    archive.printPosition(archive.size() - 1);

  }
}
