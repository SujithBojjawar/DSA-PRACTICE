import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ra(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void ra(int arr[],int n)
    {
        int first = 0;
        int last = n-1;
        while(first<last)
        {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first ++;
            last --;
        }
    }
}
