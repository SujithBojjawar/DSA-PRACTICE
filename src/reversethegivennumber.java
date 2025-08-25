import java.util.*;
public class reversethegivennumber {
    public static void main(String [] args)
    {
        Scanner num = new Scanner(System.in);
        int n;
        n=num.nextInt();
        int reverse_num=0;
        while(n>0)
        {
            int lastdigit = n%10;
            reverse_num = (reverse_num*10)+lastdigit;
            n /=10;
        }
        System.out.println("the reverse number is "+ reverse_num);
    }
}
