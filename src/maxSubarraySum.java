import java.util.*;
public class maxSubarraySum {
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
        maxsubarray(n,arr);

    }
    public static void maxsubarray(int n,int arr[])
    {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int start = i;
            for(int j=i;j<n;j++)
            {
                int end = j;
                currentsum = 0;
                for(int k =start ;k<=end ; k++)
                {
                    currentsum += arr[k];
                }
                System.out.println(currentsum);
                if(maxsum < currentsum)
                {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("the max subarray sum is "+maxsum);
    }
}
