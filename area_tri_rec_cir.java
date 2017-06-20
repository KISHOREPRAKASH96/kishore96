import java.io.*;
import java.util.*;
class formula
{
    public void triangle(int b,int h)
    {
        double pi=3.14;
        double f=0.5;
        double tri=f*b*h;
        System.out.println("area of triangle is "+tri);
    }
    public void rectangle(int b,int h)
    {
       int rec=b*h;
        System.out.println("area of rectangle is "+rec); 
    }
    public void circle(int r)
    {
         double pi=3.14;
        double cir=pi*r*r;
        System.out.println("area of circle is "+cir);
    }
}
class area_tri_rec_cir
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=s.nextInt();
            System.out.println("enter the breadth");
        int b=s.nextInt();
        System.out.println("enter the height");
        int h=s.nextInt();
        formula m=new formula();
        m.triangle(b,h);
        m.rectangle(b,h);
        m.circle(r);
        
    }
}
