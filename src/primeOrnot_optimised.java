import java.util.*;
public class primeOrnot_optimised {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
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
}
