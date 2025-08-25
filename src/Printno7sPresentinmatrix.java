import java.util.*;
public class Printno7sPresentinmatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int cnt=0;
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j] == 7)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
