import java.util.*;
public class palindrome {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
