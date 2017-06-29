import java.io.*;
import java.util.*;
class digit_appears_first
{
    public static void main(String args[])
    {
        int flag=0,count=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i]!=arr[j])
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        count++;
                        break;
                    }
                }
            }
            if(flag==1)
            {
                System.out.println(arr[i]+" ");
            }
            else if(count==n)
            {
                System.out.println("no unique elements");
            }
        }
    }
}
