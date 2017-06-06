import java.io.*;
import java.util.*;
class vowel_consonant
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char m=s.next().charAt(0);
        System.out.println(m);
       if(m=='a' || m=='e' || m=='i' ||m=='o' ||m=='u'||m=='A'||m=='E'||m=='I'||m=='O'||m=='U')
       {
        System.out.println("The given Character is vowel");
       }
      else
      {
        System.out.println("The given Character is Consonant");
      }
    }
}

