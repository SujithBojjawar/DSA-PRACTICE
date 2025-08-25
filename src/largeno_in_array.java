import java.util.*;
public class largeno_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("largest number is "+largest(arr,n));
        System.out.println("smallest number is " +smallest(arr,n));
    }
        public static int largest(int arr[],int n)
        {
            int large = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>large)
                {
                    large = arr[i];
                }
            }
            return large;
        }
//        int large = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]>large)
//            {
//                large = arr[i];
//            }
//        }
//        System.out.println(large);
    public static int smallest(int arr[] , int n)
    {
        int small =Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                small = arr[i];
            }
        }
        return small;
    }
}
