public class pgm_vowel_upper_or_lower
{
    public static void main(String s)
    {
        s=s.trim();
        int l = s.length();
        System.out.print(s.charAt(0));
        char ch, ch1;
        int i;
        for (i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    System.out.print(Character.isUpperCase(ch1)?Character.toLowerCase(ch1):Character.toUpperCase(ch1));
                }
                else
                {
                    System.out.print(ch1);
                }
        }
    }
}