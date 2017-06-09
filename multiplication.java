import java.io.*;
import java.util.*;
class multiplication
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the multiplication number");
        int n=s.nextInt();
        System.out.println("Enter the range");
        int m=s.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.println(""+n+"*"+i +"="+n*i);
        }
    }
