import java.util.*;
public class invertedstar {
    public static void main(String [] args)
    {
        Scanner star = new Scanner(System.in);
        int n;
        n=star.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
