import java.util.Scanner;
public class pgm_uppercase_and_lowercase_etc
{
    public static void main()
    {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        s=s.trim();
        int uc,lc,di,ws,tw;
        uc=lc=di=ws=tw=0;
        int k=0;
        for(int i=0; i<l;i++)
        {
            
            char ch = s.charAt(i);    
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    uc++;
                }
                else
                {
                    lc++;
                }
            }
            if(Character.isWhitespace(ch))
            {
                ws++;
            }
            if(Character.isDigit(ch))
            {
                di++;
            }
            
        }
        System.out.println("uppercase:"+uc);
        System.out.println("lowercase:"+lc);
        System.out.println("whitespace:"+ws);
        System.out.println("words:"+(ws+1));
        System.out.println("digits:"+di);
    }
}