import java.util.*;
public class leap {
    public static void main(String[] args)
    {
        Scanner day = new Scanner(System.in);
        int n;
        System.out.println("enter the year");
        n= day.nextInt();
        boolean a = (n % 4 )== 0;
        boolean b = (n%100) !=0;
        boolean c = (n % 100) == 0 && (n%4)==0;
        if( a && (b || c))
        {
            System.out.println("the enterd year is a leap year");
        }
        else {
            System.out.println("it is not the leap year");
        }
    }

}
