import java.util.*;
public class trappedWater {
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
        trappedwater(n,arr);
    }
    public static void trappedwater(int n,int arr[])
    {

        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel-arr[i];
        }
        System.out.println(trappedwater);
    }
}
 