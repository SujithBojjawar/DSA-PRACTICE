import java.util.*;
public class linear_search {
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
        int key;
        key = sc.nextInt();
        for(int i=0;i<n;i++) {
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
    }
}
