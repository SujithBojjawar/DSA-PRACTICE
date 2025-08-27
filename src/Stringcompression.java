import java.util.*;
public class Stringcompression {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(compress(str));
    }
    public static String compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(Integer.toString(count));
            }

        }
        return sb.toString() ;     //o(n)
    }
}
