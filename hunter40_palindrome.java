import java.util.Scanner;

public class hunter40_palindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		//System.out.println(sum);
		
		String str=String.valueOf(sum);
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		StringBuffer temp=sb;
		//System.out.println(temp);
		StringBuffer rev=sb.reverse();
		//System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		
		{
			System.out.println("not apalindrome");
		}
	
	
		

	}

}
