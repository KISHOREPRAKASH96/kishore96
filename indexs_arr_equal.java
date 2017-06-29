import java.util.*;
class indexs_arr_equal
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m[]=new int[n];
        for(int i=0;i<m.length;i++)
        {
            m[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==m[i])
            {
                System.out.print(m[i]+ "");
            
            }
            else
            {
                System.out.println("index is not equal");
            }
        }
    }
}
