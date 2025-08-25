import java.util.*;
public class leftRotateArrayByDElements {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int d;
        d=sc.nextInt();
        rotate(n,arr,d);
    }
    public static void rev(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int n,int arr[],int d)
    {
        d=d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
