import java.util.*;
public class palindrome_of_number_fun {
    public static boolean numpalindrome(int n)
    {
        int orgnum = n;
        int revnum = 0;
        int rem;
        while(n!=0)
        {
            rem = n%10;
            revnum = revnum*10+rem;
            n = n/10;
        }
        return orgnum == revnum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(numpalindrome(n))
        {
            System.out.println(n+" it is a palindrome number");
        }
        else {
            System.out.println(n+" it is not the palindrome number");
        }
    }
}
