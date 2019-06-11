import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count;
      int sum = 0;
      for(count=1;count<=num;count++)
      {
        sum = sum + count;
      }
      System.out.println(sum);
	}
}