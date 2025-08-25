import java.util.*;
public class Pn {
    public static void main(String [] args)
    {
        Scanner num = new Scanner(System.in);
        int n;
        n=num.nextInt();
        if(n < 0)
        {
            System.out.println("the entered number is nagetive number");
        }
        else
        {
            System.out.println("the entered number is positive number");
        }
    }
}
