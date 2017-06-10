import java.io.*;
import java.util.*;
class position
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int a=str.length();
        char ch=str.charAt(0);
        if(ch>='0' && ch<='9')
        {
            System.out.println("the 1st character is digit....so true");
        }
        else
        {
            System.out.println("the 1st character is not digit....so false");
        }
    }
}
