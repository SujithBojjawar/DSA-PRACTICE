import java.util.*;
public class avgOf3NumUsingfun {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int ans = avgOf3(a,b,c);
        System.out.println(ans);
    }
    public static int avgOf3(int a, int b,int c)
    {
        int avg = (a+b+c)/3;
        return avg;
    }
}
