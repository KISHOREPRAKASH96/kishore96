import java.io.*;
import java.util.*;
class fibo
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(int i=1;i<=n;++i)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
        
    }
}
