import java.util.*;
public class multiplicationtable {
    public static void main(String [] args)
    {
        Scanner table= new Scanner(System.in);
        int n;
        n=table.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +"*"+ i + "=" + n*i);
        }
    }
}
