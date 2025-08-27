import java.util.*;
public class substring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        String substr = "";
        s=sc.next();
        int si,ei;
        si=sc.nextInt();
        ei = sc.nextInt();
        for(int i=si;i<ei;i++)
        {
            substr += s.charAt(i);
        }
        System.out.println(substr);
        System.out.println(s.substring(si,ei));
    }
}
