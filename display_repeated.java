import java.io.*;
import java.util.*;
class display_repeated
{
    public static void main(String args[])
    {
        int j;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[arr.length];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++);
            {
            if(arr[i]==arr[j])
            {
                arr1[i]=arr[i];
                System.out.println(arr1[i]+" ");
            
            }
            }
        }
        
    }
}

