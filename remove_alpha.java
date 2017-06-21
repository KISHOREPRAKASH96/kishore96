import java.io.*;
import java.util.*;
class remove_alpha
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next().replaceAll("[/^A-Za-z-a/]","");
        System.out.println(str);
    }
}
