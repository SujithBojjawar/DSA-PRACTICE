import java.util.*;
public class sumofNnaturalnumbers {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n,sum=0,c=1;
        n= num.nextInt();
        while(c<=n)
        {
            sum += c;
            c++;
        }
        System.out.println(sum);
    }
}
