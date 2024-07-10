import java.util.Scanner;
public class pgm_shortest_word
{
    public static void main()
    {
        System.out.println("Enter a sentence ending wit a space and a full stop");
        int l1=6969;
        String s1="";
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            String s=sc.next();
            if(s.equals("."))
            {
                break;
            }
            int l=s.length();
            if(l1>l)
            {
                l1=l;
                s1=s;
            }
        }
        System.out.println(s1);
    }
} 