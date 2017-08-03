import java.util.Scanner;
public class interst
{
public static void main(String args[])
{
double p,n,r;
Scanner s=new Scanner(System.in);
System.out.println("Enter the principal:");
p=s.nextDouble();
System.out.println("Enter the rate of intrest:");
n=s.nextDouble();
System.out.println("Enter the time period:");
r=s.nextDouble();
double si;
si=(p*n*r)/100;
System.out.println("The Simple Intrest is:"+si);
}
}
