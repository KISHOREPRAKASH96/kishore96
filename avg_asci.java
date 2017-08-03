import java.util.Scanner;

public class avg_asci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double sum=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		double a=(double)c[i];
		//System.out.println(a);
		sum+=a/str.length();
		
		}
		char x=(char)sum;
		System.out.println("the password is  :"+x );
	}

}
