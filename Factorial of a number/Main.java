import java.util.Scanner;
class Main{
  
 int factorial(int n) 
  { 
  
    // single line to find factorial 
    return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
  
  } 
  
  
  // Driver Code 
  public static void main(String args[])      
  { 
    Scanner in = new Scanner(System.in);
    Main obj = new Main();
    int num = in.nextInt(); 
    int factorial;
    System.out.println(obj.factorial(num)); 
   } 
} 