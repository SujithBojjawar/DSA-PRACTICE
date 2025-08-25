import java.util.*;
public class insertionsort {
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
        insert(n,arr);
        print(n,arr);
    }
    public static void insert(int n,int arr[])
    {
        for(int i=1;i<n;i++)
        {
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void print(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
