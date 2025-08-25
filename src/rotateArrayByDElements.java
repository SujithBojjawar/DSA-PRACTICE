import java.util.*;
public class rotateArrayByDElements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int d;
        d= sc.nextInt();
        rotateArrayByD(n,arr,d);    }
    public static void rotateArrayByD(int n, int arr[],int d)
    {
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void reverse(int arr[] , int start, int end)
    {
        while(start<=end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
