import java.io.*;
import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String m=s.nextLine();
        StringBuffer sb=new StringBuffer();
        sb.append(m);
    
      System.out.println(sb.reverse());
    }
}
