import java.util.*;
public class factorial {
    public static void main(String [] args)
    {
        Scanner facto = new Scanner(System.in);
        int n,fact = 1;
        n=facto.nextInt();
        for(int i=1;i<n;i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}
