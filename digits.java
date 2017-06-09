import java.io.*;
import java.util.*;
class digits
{
    public static void main(String args[])
    {
        int rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digits");
        int n=s.nextInt();
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
