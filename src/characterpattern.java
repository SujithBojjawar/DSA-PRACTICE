import java.util.*;
public class characterpattern {
    public static void main(String[] args)
    {
        Scanner chare = new Scanner(System.in);
        int n;
        char  ch = 'A';
        n=chare.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
