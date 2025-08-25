import java.util.*;
public class leftRorateArrayByOnePlace {
    public static void main(String[] arga)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        rotateleftby1(n,arr);

    }
    public static void rotateleftby1(int n,int arr[])
    {
        int temp = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println("new array is"+Arrays.toString(arr));
    }
}
