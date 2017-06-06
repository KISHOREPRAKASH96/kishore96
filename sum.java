import java.io.*;
import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
System.out.println("ENTER THE N NUMBER TO SUM");
        int n=s.nextInt();
       for(int i=1;i<=n;i++)
{
System.out.println("ENTER THE VALUE OF A "+i);
        int a=s.nextInt();
System.out.println("ENTER THE VALUE OF B "+i);
        int b=s.nextInt();
        int c;
 
c=a+b;
System.out.println("the sum of A" +i+ " and B " +i+ " is " +c);
}
    }
}
