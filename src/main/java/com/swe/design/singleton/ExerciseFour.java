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

  class SingletonTwo implements Singleton {
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
    Singleton s1 = SingletonOne.getInstance();
    Singleton s2 = Factory.getInstance();

    ExerciseFour ef = new ExerciseFour();
    Builder b = ef.new SingletonBuilder();
    Singleton s3 = b.create();
  }
}
