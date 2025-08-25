import java.util.*;
public class bubblesort {
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
        bubblesortfun(n,arr);
        print(n,arr);
    }
    public static void bubblesortfun(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
