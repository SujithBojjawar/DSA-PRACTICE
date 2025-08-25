import java.util.*;
public class maxElementinArray {
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
        int maxele = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxele)
            {
                maxele = arr[i];
            }
        }
        System.out.println("the max element is "+maxele);
    }
}
