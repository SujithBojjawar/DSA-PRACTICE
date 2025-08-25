import java.util.*;
public class FindInMountainArray {
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
        int target;
        target = sc.nextInt();
        int peakele = findPeak(n,arr);
        int left = binarysearch(arr,target,0,peakele,true);
        if(left !=-1)
        {
            System.out.println(left);
        }
        int right = binarysearch(arr,target,peakele+1,n-1,false);
        if(right != -1)
        {
            System.out.println(right);
        }
        if(left == -1 && right == -1)
        {
            System.out.println("element not found");
        }
    }
    public static int findPeak(int n,int arr[])
    {
        int start = 0;
        int end = n-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    public static int binarysearch(int arr[], int target, int start, int end, boolean ascending)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            if(ascending)
            {
                if(target<arr[mid])
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else {
                if(target < arr[mid])
                {
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
