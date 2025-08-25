import java.util.*;
public class maxsubarrayusing_prefixsum {
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
        int prefixarray[] = new int[n];
        prefixarray[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            prefixarray[i] = prefixarray[i-1] + arr[i];
        }
        for(int i=0;i<n;i++)
        {
            int start = i;
            for(int j=i;j<n;j++)
            {
                int end = j;
                if(start == 0)
                {
                    currentsum = prefixarray[end];
                }
                else {
                    currentsum = prefixarray[end] - prefixarray[start-1];
                }
                if(maxsum<currentsum)
                {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("the maxsum is "+ maxsum);
    }
}
