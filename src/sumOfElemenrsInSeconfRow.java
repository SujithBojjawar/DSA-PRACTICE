import java.util.*;
public class sumOfElemenrsInSeconfRow {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int sum=0;
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        if(n>=2)
        {
            for(int j=0;j<m;j++)
            {
                sum+= mat[1][j];
            }
        }
        else {
            System.out.println("matrix length is lesser than 2");
        }
        System.out.println(sum);
    }
}
