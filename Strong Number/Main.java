import java.util.Scanner; 
class Main 
{ 
 public static void main(String args[]) 
 { 
  Main ss=new Main(); 
  int a,b,r,s=0; 
  Scanner in=new Scanner(System.in); 
  b=in.nextInt(); 
  a=b; 
  while(b>0) 
  { 
   r=b%10; 
   s=s+ss.fact(r); 
   b=b/10; 
  } 
  if(a==s) 
   System.out.println("Yes"); 
   else
     System.out.println("No");
  } 
  int fact(int i) 
  { 
  int f,j; 
  f=1; 
  for(j=i ;j>0;j--) 
  f=f*j; 
  return f; 
  } 
} 