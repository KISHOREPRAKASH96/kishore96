import java.util.Scanner;

public class num_palindrome {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String sam=str;
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		StringBuffer nn=sb.reverse();
		String maathu=String.valueOf(nn);
		if(sam.contains(maathu))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
	}

}
