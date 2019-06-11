import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int num = 1 ; num <= n ; num++) {
			System.out.print(num);
			if(num == 3)
    			System.out.print(",");
          else if(num == 6)
            System.out.print(",");
          else if(num == 9)
            System.out.print(",");
          else if(num == 12)
            System.out.print(",");
		}
    }
 }