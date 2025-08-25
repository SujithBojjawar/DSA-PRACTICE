import java.util.*;
public class primeornot {
    public static void main(String[] args)
    {
        Scanner prime = new Scanner(System.in);
        int n;
        n= prime.nextInt();
        boolean isprime = true;
        if(n == 2)
        {
            System.out.println("it is the prime number");
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime = false;
                }
            }
            if(isprime == true)
            {
                System.out.println("it is the prime number");
            }
            else {
                System.out.println("it is not the prime number");
            }

        }
    }
}
