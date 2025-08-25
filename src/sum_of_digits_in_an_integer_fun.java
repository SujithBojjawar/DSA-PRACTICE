import java.util.*;
public class sum_of_digits_in_an_integer_fun {
    public static int sumofdig(int n)
    {
        int sum = 0;
        int rem;
        while(n!=0)
        {
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int sum = sumofdig(n);
        System.out.println(sum);
    }
}
