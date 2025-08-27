import java.util.*;
public class printinglettersinstrings {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String firstname;
        firstname = sc.nextLine();
        String lastname;
        lastname = sc.nextLine();
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }
    }
}
