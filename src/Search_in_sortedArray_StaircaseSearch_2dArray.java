import java.util.*;
public class Search_in_sortedArray_StaircaseSearch_2dArray {
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
        int key;
        key = sc.nextInt();
        staircaseSearch(n,m,mat,key);
    }
    public static void staircaseSearch(int n,int m,int mat[][],int key)
    {
        int row = 0;
        int clm = m-1;
        while(row<n && clm >=0)
        {
            if(mat[row][clm] == key)
            {
                System.out.println("element found"+row+","+clm);
                break;
            }
            else if(key<mat[row][clm])
            {
                clm--;
            }
            else {
                row++;
            }
        }
        System.out.println("the element your searching is not there in the matrix");
    }
}
