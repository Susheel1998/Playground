import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      if(n1>n2)
      {
        if(n1>n3)
        System.out.println(n1);
        else
          System.out.println(n3);
    }
      else if(n2>n3)
      {
        if(n2>n1)
          System.out.println(n2);
        else
          System.out.println(n1);
      }
      else
      {
        if(n3>n2)
          System.out.println(n3);
        else
          System.out.println(n2);
      }
}
}