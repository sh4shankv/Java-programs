import java.util.Scanner;
class Palindromic_words
{
    public boolean is_palindrome(String s)
    {
        String s1="";
        for(int i = s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s1.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Palindromic_words A = new Palindromic_words();
        System.out.println("Enter a sentence ending wit a space and a full stop");
        while(true)
        {
            String s=sc.next();
            if(s.equals("."))
            {
                break;
            }
            boolean check=A.is_palindrome(s);
            if(check==true)
            {
                System.out.print(s+" ");
            }
            else
            {
                for (int i = s.length()-2;i>=0;i--)
                {
                    s=s+s.charAt(i);
                }
                System.out.print(s+" ");
            }
        }
    }
}