import java.util.Scanner;
public class pgm_max_vowel_count_in_a_word
{
    public static void main()
    {
        System.out.println("Enter a string ending with space and a full stop");
        int f=0, f1=0;
        String s1="";
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            String s=sc.next().toUpperCase();
            if(s.equals("."))
            {
                break;
            }
            for(int i =0; i<s.length(); i++)
            {
                char ch=s.charAt(i);
                if (ch=='A'||ch=='U'||ch=='O'||ch=='I'||ch=='E')
                {
                    f++;
                }
                if(f1<f)
                {
                    f1=f;
                    s1=s;
                }
                f=0;
            }
        }
        System.out.println("Word with maximum vowel:"+s1);
    }
}