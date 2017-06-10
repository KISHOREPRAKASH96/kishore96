import java.io.*;
import java.util.*;
class str_inte
{
    public static void main(String args[])
    {
        try
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String st=s.nextLine();
        int a=Integer.parseInt(st);
        System.out.println(a);
    }
        catch(NumberFormatException a)
        {
            System.out.println("the string is converted to int");
        }
    }
}
