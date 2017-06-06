import java.io.*;
import java.util.*;
class count
{
    public static void main(String args[])
    {
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int number=s.nextInt();
        while(number>0) 
        {
			number=number/10;
			count=count+1; 
		}
		System.out.println("the number of digits are  " +count);
	
    }
}
