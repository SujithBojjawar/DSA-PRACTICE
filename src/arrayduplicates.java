import java.util.*;
public class arrayduplicates {
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
        System.out.println(duplicates(n,arr));

    }
    public static boolean duplicates(int n, int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
