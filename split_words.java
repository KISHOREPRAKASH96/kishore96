import java.util.Scanner;

public class split_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		for(String m:arr)
		{
			StringBuffer sb=new StringBuffer();
			sb.append(m);
			System.out.print(sb.reverse()+"\t");
		}

	}

}
