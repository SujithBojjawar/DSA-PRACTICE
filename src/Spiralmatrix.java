import java.util.*;
public class Spiralmatrix {
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
        SpiralMat(n,m,mat);
    }
    public static void SpiralMat(int n,int m,int mat[][])
    {
        int startrow = 0;
        int startcol = 0;
        int endrow = n-1;
        int endcol = m-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(mat[startrow][j]+" ");
            }
            for(int i= startrow+1;i<=endrow;i++)
            {
                System.out.print(mat[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow == endrow)
                {
                    break;
                }
                System.out.print(mat[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol == endcol)
                {
                    break;
                }
                System.out.print(mat[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
}
