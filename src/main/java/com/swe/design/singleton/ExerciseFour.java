package com.swe.design.singleton;

public class ExerciseFour {

  interface Singleton {
  }

  class SingletonOne implements Singleton {
    private static ExerciseFour ef = new ExerciseFour();
    private static Singleton instance = ef.new SingletonOne();

    private SingletonOne() {
    }

    public static Singleton getInstance() {
      return instance;
    }
  }

  // Since this this ExerciseFour we are coding everythin in one file
  //
  class SingletonTwo implements Singleton {
    protected SingletonTwo() {
    }
  }

  public class Factory {
    private static ExerciseFour ef = new ExerciseFour();
    private static final Singleton instance = ef.new SingletonTwo();

    public static Singleton getInstance() {
      return instance;
    }
  }

  interface Builder {
    public void reset();

    public Singleton create();
  }

  // For this implementation since the object is so simple that there is no
  // difference between the two implementations, we will use the first one.
  // -> A very simple builder is then a Factory.
  public class SingletonBuilder implements Builder {
    private static ExerciseFour ef = new ExerciseFour();
    private static SingletonTwo instance = ef.new SingletonTwo();

    @Override
    public void reset() {
      SingletonBuilder.instance = ef.new SingletonTwo();
    }

    @Override
    public Singleton create() {
      return SingletonBuilder.instance;
    }
  }

  public static void execute() {

    Singleton s2 = Factory.getInstance();
    Singleton s1 = SingletonOne.getInstance();

    ExerciseFour ef = new ExerciseFour();
    Builder b = ef.new SingletonBuilder();
    Singleton s3 = b.create();
  }
}
