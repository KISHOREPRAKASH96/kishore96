import java.io.*;
import java.util.*;
class work_holi
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        switch(t)
        {
            case "monday":
                {
                    System.out.println("true");
                    break;
                }
                case "tuesday":
                {
                    System.out.println("true");
                    break;
                }
                case "wednesday":
                {
                    System.out.println("true");
                    break;
                }
                case "thursday":
                {
                    System.out.println("true");
                    break;
                }
                case "friday":
                {
                    System.out.println("true");
                    break;
                }
                case "saturday":
                {
                    System.out.println("true");
                    break;
                    
                }
                case "sunday":
                {
                    System.out.println("false");
                    break;
                    
                }
                default:
                {
                    System.out.println("it is not a day");
                }
        }
    }
}
