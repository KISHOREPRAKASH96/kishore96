import java.util.*;
class reverse_words
{  
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String wo[]=str.split("\\s");  
    String rw="";  
    for(String w:wo){  
        StringBuffer sb=new StringBuffer(w);  
        sb.reverse();  
        rw+=sb.toString()+" ";  
    }  
    System.out.println(rw.trim());  
}  
}  
