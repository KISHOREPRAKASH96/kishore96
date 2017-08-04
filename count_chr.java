import java.util.Scanner;

public class count_chr 
{

	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine().replaceAll("[0123456789]", "");
		// TODO Auto-generated method stub
        int len=str.length();
	System.out.println(len);

}
}
