import java.util.*;
class reverse_odd_indexed
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(String arr:str.split(" "))
        {
            int a=arr.length()-1;
            if(a%2==1)
            {
                StringBuffer sb=new StringBuffer();
                 sb.append(arr);
              System.out.print(" "+sb.reverse()+" ");
            }
            else
            {
             System.out.print(arr+" ");   
            }
        }
        
    }
}
