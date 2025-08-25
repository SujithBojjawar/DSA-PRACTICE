import java.util.*;
public class halfpyramindnum {
    public static void main(String[] args)
    {
        Scanner pyr = new Scanner(System.in);
        int n;
        n=pyr.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
