import java.io.*;
import java.util.*;
class reverse_inte
{
    public static void main(String args[])
    {
        int rev=0;
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.println(m);
        while(m!=0)
        {
            rev=rev*10+m%10;
            m=m/10;
        }
        System.out.println(rev);
    }
}
