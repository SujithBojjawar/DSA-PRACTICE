import java.util.*;
public class bestTimeToBuyAndSellStock {
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
        stock(n,arr);

    }
    public static void stock(int n,int arr[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<n;i++)
        {
            if(buyprice<arr[i])
            {
                int profit = arr[i]-buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else {
                buyprice = arr[i];  
            }
        }
        System.out.println(maxprofit);
    }
}
