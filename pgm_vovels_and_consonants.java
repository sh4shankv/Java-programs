public class pgm_vovels_and_consonants
{
    public static void main(String s)
    {
        s=s.trim().toUpperCase();
        int l = s.length();
        int v=0;
        int c=0;
        for(int i=0; i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch))
            {
                continue;
            }
            if(Character.isLetter(ch))
            {
                if(ch=='A'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
        }
        System.out.println(c);
        System.out.println(v);
    }
}