import java.util.Scanner;


public class ascii {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		String encry="";
		String encry1="";
		
		//String spli[]=str.split(" ");
		for(int i=0;i<str.length();i++)
		{
			int as=Integer.valueOf(str.charAt(i));
			int q=as+10;
			if(q>122)
			{
				int temp=122-as;
				int no=10-temp;
				int res=96+no;
				q=res;
				
			encry+=(char)q;
			}
			else
			{
				encry+=(char)q;

			}
			
	    }
		for(int j=0;j<str1.length();j++)
		{
			if((j==0)||(j==str1.length()-1))
			{
				encry1+=str1.charAt(j);
			}
			else
			{
				int ass=Integer.valueOf(str1.charAt(j));
				int m=ass+10;
				if(m>122)
				{
					int temp1=122-ass;
					int noo=10-temp1;
					int res1=96+noo;
					m=res1;
					
				encry1+=(char)m;

				}
				else
				{
					encry1+=(char)m;
			
				}
				
		    
		}
		


	}
		System.out.println(encry +" "+ encry1);

	}}
