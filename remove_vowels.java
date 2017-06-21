import java.io.*;
import java.util.*;
class remove_vowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        
        System.out.println("the reversed string is  "+sb.reverse());
        String str1=new String(str).replaceAll("[aeiouAEIOU]","");
        StringBuffer sf=new StringBuffer();
        sf.append(str1);
        
        System.out.println("the removed vowels string is  "+sf);
        
    }
}
