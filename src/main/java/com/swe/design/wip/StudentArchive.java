package com.swe.design.wip;

public class StudentArchive {
  public String[] students = { "A", "B", "C", "D" };

  public void printLeftToRight() {
    for (int i = 0; i < students.length; i++) {
      System.out.print(students[i]);
    }
    System.out.println('\n');
  }

  public void printRightToLeft() {
    for (int i = students.length - 1; i >= 0; i--) {
      System.out.print(students[i]);
    }
    System.out.println('\n');
  }

  public int size() {
    return students.length;
  }

  public void printPosition(int position) {
    System.out.println(students[position]);
  }

}
