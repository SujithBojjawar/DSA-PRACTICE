import java.util.*;
public class SmallestAndLargestElementInanMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        small_number(mat,n,m);
        large_number(mat,n,m);
    }
    public static void small_number(int mat[][] , int n, int m)
    {
        int sn = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] < sn)
                {
                    sn = mat[i][j];
                }
            }
        }
        System.out.println(sn);
    }
    public static void large_number(int mat[][] , int n, int m)
    {
        int sn = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] > sn)
                {
                    sn = mat[i][j];
                }
            }
        }
        System.out.println(sn);
    }

}
