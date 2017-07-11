import java.util.*;
class maxi
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<num;i++)
        {
        if(arr[0]<arr[i])
        {
            arr[0]=arr[i];
        }
        
        
    }
        System.out.print(arr[0]-1+" thousand");
    }
}
