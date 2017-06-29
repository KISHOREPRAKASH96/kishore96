import java.util.*;
class count_prime
{
    public static void main(String args[])
    {
        int count=0,flag=0,j;
        Scanner s=new Scanner(System.in);
        int range1=s.nextInt();
        int range2=s.nextInt();
        for(int i=range1;i<range2;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                    break;
                }
            }
            if(i==j)
            {
                count++;
            }
                
        
        }
        
        System.out.println(count);
    }
}
