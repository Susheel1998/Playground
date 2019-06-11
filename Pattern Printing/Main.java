import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
            Scanner in = new Scanner(System.in);
      int rows = in.nextInt();
      int temp = 0;
      for(int i=rows;i>=1;i--)
      {
        for(int j=rows;j>=i;j--)
        {
          System.out.print(j+"");
          temp = j;
        }
        for(int k=rows-i+1;k<rows;k++)
        {
          System.out.print(temp+"");
        }
        System.out.println();
    }
}
}