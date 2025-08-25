import java.util.*;
public class even_functions {
    public static boolean iseven(int n)
    {
        return n%2==0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(iseven(n))
        {
            System.out.println(n +" is even number");
        }
        else {
            System.out.println(n +" is not even number");
        }
    }
}
