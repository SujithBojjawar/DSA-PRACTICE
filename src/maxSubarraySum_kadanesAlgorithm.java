import java.util.*;
public class maxSubarraySum_kadanesAlgorithm {
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
        kadanes(n,arr);

    }
    public static void kadanes(int n, int arr[])
    {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currentsum = currentsum + arr[i];
            maxsum = Math.max(currentsum,maxsum);
            if(currentsum < 0)
            {
                currentsum = 0;
            }
        }
        System.out.println("the max subarray sum is " + maxsum);
    }
}

// other solution also can be used
//class Solution {
//    public int maxSubArray(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        int maxsum = nums[0];
//        int currsum = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            currsum = Math.max(nums[i], currsum + nums[i]);
//            maxsum = Math.max(maxsum, currsum);
//        }
//
//        return maxsum;
//    }
//}
