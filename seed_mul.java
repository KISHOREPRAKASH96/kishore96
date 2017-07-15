import java.util.Scanner;

public class seed_mul 

{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r,s;
        s=n;
        while(n!=0)
        {
            r=n%10;
            s=s*r;
            n=n/10;
        }
        System.out.println(s);
    }   
}
