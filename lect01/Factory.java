public class Factory {
  public static printer create(int id) {
    printer p = new printer();
    if (id == 1) {
      p = new printer1();
    }
    return p;
  }
}
