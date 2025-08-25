import java.util.*;
public class binarysearch {
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
        Arrays.sort(arr);
        int k;
        k=sc.nextInt();
        System.out.println(bs(arr,k));
    }
    public static int bs(int arr[] , int k)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == k)
            {
                return mid;
            }
            if(arr[mid] < k)
            {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}
