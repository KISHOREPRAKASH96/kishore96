import java.util.Scanner;

public class vow_f_con_s {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String con=str.replaceAll("[aeiouAEIOU]","");
		//System.out.println(con);
		String vow=str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","");
		//System.out.println(vow);
		String dis=vow+con;
		System.out.println("the output is:"+dis);

	}

}
