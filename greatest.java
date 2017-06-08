
import java.io.*;
import java.util.*;
class greatest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
System.out.println("Enter X");
        int x=s.nextInt();
System.out.println("Enter Y");
        int y=s.nextInt();
System.out.println("Enter Z");
        int z=s.nextInt();
        if(x > y && x > z)
       {	  
           System.out.println(x+" is greatest");
       }
	        else if(y > z)
        { 
            System.out.println(y+" is greatest");
        }
        else
        {
           System.out.println(z+" is greatest");
        }
    }
}
