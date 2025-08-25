import java.util.*;
public class revrsernumber {
    public static void main(String [] args)
    {
        Scanner rev = new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=rev.nextInt();
        while(n>0)
        {
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n /=10;
        }
        System.out.println();
    }
}
