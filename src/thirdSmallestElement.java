import java.util.*;
public class thirdSmallestElement {
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
        int tse = tsearr(n,arr);
        if(tse == -1)
        {
            System.out.println("elements not found");
        }
        else {
            System.out.println(tse);
        }
    }
    public static int tsearr(int n,int arr[])
    {
        if(n<3)
        {
            return -1;
        }
        int fse = Integer.MAX_VALUE;
        int sse = Integer.MAX_VALUE;
        int tse = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < fse)
            {
                tse = sse;
                sse = fse;
                fse = arr[i];
            }
            else if(arr[i] > fse && arr[i] < sse)
            {
                tse = sse;
                sse = arr[i];
            }
            else if(arr[i] > sse && arr[i] < tse)
            {
                tse = arr[i];
            }
        }
        if(tse == Integer.MAX_VALUE)
        {
            return -1;
        }
        else {
            return tse;
        }
    }
}
