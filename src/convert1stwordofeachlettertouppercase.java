import java.util.*;
public class convert1stwordofeachlettertouppercase {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String str;
       str=sc.nextLine();
       System.out.println(uppercase(str));
    }
    public static String uppercase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();   //o(n)
    }
}
