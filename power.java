import java.io.*;
import java.util.*;
class power
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number");
    int p1=s.nextInt();
    System.out.println("Enter the power of the given number");
    int p2=s.nextInt();
    int res=1;
    if(p1>0)
    {
    for(int i=1;i<=p2;i++)
    {
       res=res*p1;
    }
    System.out.println("power of given is" +res);
}
    }
}
