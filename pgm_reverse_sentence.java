import java.util.Scanner;
public class pgm_reverse_sentence
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending wit a space and a full stop");
        String s1="";
        while(true)
        {
            String s=sc.next();
            if(s.equals("."))
            {
                break;
            }
            s1=s+" "+s1;
        }
        System.out.println(s1);
    }
}
