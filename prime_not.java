import java.io.*;
import java.util.*;
class prime_not
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        int m=n/2;
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                flag=1;
                System.out.println("not a prime");
            break;
            }
            
            
        }
        if(flag==0)
        {
            
              System.out.println("prime");  
        }
        
        
    }
}
