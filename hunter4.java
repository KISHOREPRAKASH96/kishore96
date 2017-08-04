

import java.util.*;
public class hunter4
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	str.replaceAll(",","");
	for(int i=0;i<str.length();i++)
	if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
		System.out.println(str.charAt(i));
}
}
