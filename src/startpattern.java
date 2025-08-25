import java.util.*;
public class startpattern {
    public static void main(String [] args)
    {
        Scanner star = new Scanner(System.in);
        int n;
        n=star.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
