import java.io.*;
import java.util.*;
class count_chars
{
    public static void main(String args[])
    {
        int count=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().replaceAll(" ","");
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
                count++;
        }
        System.out.println(count);
    }
}
