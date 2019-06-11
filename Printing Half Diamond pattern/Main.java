import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        int i, j; 
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
  
    // LOOP FOR HUT PYRAMID  
    for (i = 0, j = 0; i < n; j++)  
    { 
        if (j == n + i)  
        { 
            j = -1; 
            ++i; 
            System.out.print("\n"); 
        } // print Center Star triangle  
        else if ((i + j) >= n - 1)  
        { 
            System.out.print("*"); 
        }  
        else 
        { 
            System.out.print(" "); 
        } 
    } 
    }
    }