import java.util.*;
public class Main<T> {
  private T t;
  public void insert(T t) {
    this.t = t;
  }
  public T get() {
    return t;
  }
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    Main<Integer> i = new Main<Integer>();
    int num = in.nextInt();
    i.insert(num);
    Main<String> str = new Main<String>();
    String str1 = in.next();
    str.insert(str1);
    Main<Float> f1 = new Main<Float>();
    float f = in.nextFloat();
    f1.insert(f);
    System.out.println("Integer Value: "+i.get());
    System.out.println("String Value: "+str.get());
    System.out.println("Float value: "+f1.get());
  }
}
