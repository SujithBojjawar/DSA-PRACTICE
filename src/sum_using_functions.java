import java.util.*;
public class sum_using_functions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int sum = calculatesum(a,b); // arguements or actual parameters
        System.out.println("sum is "+sum);
    }
    public static int calculatesum(int a,int b) // paramneters
    {
        int sum = a+b;
        return sum;
    }
}


