import java.util.*;
public class Primes_range {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
        prime_range(n);
    }
    public static boolean isprime(int n)
    {
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void prime_range(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
