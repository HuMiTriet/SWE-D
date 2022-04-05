// Look up the java iterator interface and how it is used
package com.swe.design.iterator;

import java.util.Arrays;

public class NameRepository {
  private String[] names = { "D", "A", "C", "B" };

  public Iterator getIterator() {
    return new NameIterator();
  }

  public Iterator getOrderedIterator() {
    return new OrderedIterator();
  }

  public class NameIterator implements Iterator {
    int index = 0;

    @Override
    public boolean hasNext() {
      if (index < names.length) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }
  }

  public class OrderedIterator extends NameIterator {

    public OrderedIterator() {
      Arrays.sort(names);
    }
  }

}
