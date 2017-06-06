import java.io.*;
import java.util.*;
class odd_even
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n);
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
