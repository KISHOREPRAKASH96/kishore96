
import java.io.*;
import java.util.*;
class duplicate
{
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter any word : ");
        String s = m.nextLine();
        int l = s.length();
        char ch;
        String ans="";
         
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')

    {
    ans = ans + ch;
    }
             
            
        }
 
       System.out.println(ans);
    }
}
