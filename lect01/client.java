public class client {
  public static void main(String[] args) {
    printer p1 = Factory.create(1);
    p1.print();
  }
}
