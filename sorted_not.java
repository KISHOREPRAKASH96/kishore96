import java.util.Scanner;

public class sorted_not {

	public static void main(String[] args)
	{
		int flag=0;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		int num[]=new int[n];
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
			for(int j=1;j<num.length;j++)
			{
			if(num[i]<num[j])
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
				break;
			}
		   }
		}
		if(flag==0)
		{
			System.out.println("unsorted");
		}
		else if(flag==1)
		{
			System.out.println("sorted");
		}

	}
