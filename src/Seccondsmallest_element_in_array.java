import java.util.*;
public class Seccondsmallest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ssel = ssele(arr,n);
        if(ssel == -1)
        {
            System.out.println("no element found");
        }
        else {
            System.out.println(ssel);
        }
    }
    public static int ssele(int arr[],int n)
    {
        if(n<2)
        {
            return -1;
        }
        int fsel = Integer.MAX_VALUE;
        int ssel = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < fsel)
            {
                ssel = fsel;
                fsel = arr[i];
            }
            else if(arr[i]>fsel && arr[i] < ssel) {
                ssel = arr[i];
            }
        }
        if(ssel == Integer.MAX_VALUE)
        {
            return -1;
        }
        else {
            return ssel;
        }
    }
}
