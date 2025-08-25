import java.util.*;
public class selectionsort {
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
        sele(n,arr);
        print(n,arr);
    }
    public static void sele(int n, int arr[])
    {
        for(int i=0;i<n-1;i++)
        {
            int minpos = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
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
