import java.util.Scanner;
public class pali
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); int c=0;
        System.out.println("enter a senternce");String s1="";
        while(true)
        {
            String s=sc.next();
            if(s.equals("."))
                break;
            int l= s.length();
            for(int i=l-1;i>=0;i--)
            {
                s1+=s.charAt(i);
                if(s.equals(s1))
                {
                    System.out.println(s);
                    c++;
                }
            }
            s1="";
        }
        System.out.println("Total Palindromic words are : "+c);
    }
}