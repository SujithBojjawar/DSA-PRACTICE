import java.util.*;

public class bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(firstOccur(arr, key));
        System.out.println(lastOccur(arr, key));
    }

    public static int firstOccur(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static int lastOccur(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) { // Fixed condition (<= instead of <)
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}

