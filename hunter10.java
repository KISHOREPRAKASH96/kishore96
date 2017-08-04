import java.util.Scanner;

public class hunter10 {

	public static void main(String[] args) {
		int temp=0;
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int arr1[]=new int[n];
for(int i=0;i<arr1.length;i++)
{
	arr1[i]=s.nextInt();
}
int arr2[]=new int[n];
for(int j=0;j<arr1.length;j++)
{
	arr2[j]=s.nextInt();
}
for(int k=0;k<arr2.length;k++)
{
	if(arr1[k]==arr2[k])
	{
		temp=temp+1;
	}
}
if(temp==arr2.length)
{
	System.out.println("arr1 is subset of arr2");
}
else

{
	System.out.println("arr1 is not a subset of arr2");
}
	}

}
