
import java.util.*;
public class countsort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        cnt(n,arr);
        print(n,arr);
    }
    public static void cnt(int n, int arr[])
    {
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            lar = Math.max(lar,arr[i]);
        }
        int count[] = new int[lar+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void print(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
