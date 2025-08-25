import java.util.*;
public class arraypairs {
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
        pairs(arr,n);
    }
    public static void  pairs(int arr[] , int n)
    {
        int tp = 0;   //totalpairs
        for(int i=0;i<n;i++)
        {
            int curr = arr[i];
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are "+tp);
    }
}
// time complexity n^2
