import java.io.*;
import java.util.*;
class fact
{
    public static void main(String args[])
    {
        int fact=1,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of  " +i+" is  " +fact);
        
    }
}
