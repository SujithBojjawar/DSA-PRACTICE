import java.util.*;
public class first_and_last_ele_bs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int key;
        key = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(firstoccur(arr,key));
        System.out.println(lastoccur(arr,key));
        sc.close();

    }
    public static int firstoccur(int arr[], int key)
    {
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end-start)/2 ;
            if(arr[mid] == key)
            {
                res= mid;
                end = mid-1;
            }
            if(arr[mid] > key)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return res;
    }


    public static int lastoccur(int arr[] , int key)
    {
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == key)
            {
                res = mid;
                start = mid+1;
            }
            else if(arr[mid]>key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return res;
    }
}


//import java.util.*;
//
//public class FirstAndLastElementBS {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int key = sc.nextInt();
//        Arrays.sort(arr);
//
//        System.out.println(firstOccur(arr, key));
//        System.out.println(lastOccur(arr, key));
//
//        sc.close(); // Close the scanner to avoid resource leak
//    }
//
//    public static int firstOccur(int arr[], int key) {
//        int start = 0;
//        int end = arr.length - 1;
//        int res = -1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == key) {
//                res = mid;
//                end = mid - 1; // Move left to find the first occurrence
//            } else if (arr[mid] > key) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return res;
//    }
//
//    public static int lastOccur(int arr[], int key) {
//        int start = 0;
//        int end = arr.length - 1;
//        int res = -1;
//
//        while (start <= end) { // Fixed condition (<= instead of <)
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == key) {
//                res = mid;
//                start = mid + 1; // Move right to find the last occurrence
//            } else if (arr[mid] > key) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return res;
//    }
//}
//
