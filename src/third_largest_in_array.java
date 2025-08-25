import java.util.*;
public class third_largest_in_array {
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
        int tl = tle(arr,n);
        if(tl  == -1)
        {
            System.out.println("element not found in the array");
        }
        else {
            System.out.println(tl);
        }
    }
    public static int tle(int arr[], int n)
    {
        if(n<3)
        {
            return -1;
        }
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > fl)
            {
                tl = sl;
                sl = fl;
                fl = arr[i];
            }
            else if(arr[i] > sl && arr[i] < fl)
            {
                tl = sl;
                sl = arr[i];
            }
            else if(arr[i] > tl && arr[i] < sl){
                tl = arr[i];
            }
        }
        if(tl == Integer.MIN_VALUE)
        {
            return -1;
        }
        else {
            return tl;
        }
    }
}
