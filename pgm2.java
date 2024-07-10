import java.util.Scanner;
public class pgm2
{
    public static void main()
    {
        System.out.println("Enter a sentence ending wit a space and a full stop");
        int f=0, f1=0;
        String s1="";
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            String s=sc.next().toUpperCase();
            int l =s.length();
            if(s.equals("."))
            {
                break;
            }
            char ch=s.charAt(0);
            char ch1=s.charAt(l-1);
            if ((ch=='A'||ch=='U'||ch=='O'||ch=='I'||ch=='E' )&& (ch1=='A'||ch1=='U'||ch1=='O'||ch1=='I'||ch1=='E'))
                {
                    System.out.println(s);
                }
        }
    }
}