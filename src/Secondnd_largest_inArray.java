import java.util.*;
public class Secondnd_largest_inArray {
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
        int sl = sle(arr,n);
        if(sl == -1)
        {
            System.out.println("no element found in array");
        }
        else {
            System.out.println(sl);
        }

    }
    public static int sle(int arr[] , int n)
    {
        if(n<2)
        {
            return -1;
        }
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if (arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            } else if (arr[i] < fl && arr[i] > sl) {
                sl = arr[i];
            }
        }
            if(sl == Integer.MIN_VALUE)
            {
                return -1;
            }
            else {
                return sl;
            }
    }
}
