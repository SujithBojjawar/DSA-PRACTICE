import java.util.*;
public class calculator {
    public static void main(String [] args)
    {
        Scanner cal = new Scanner(System.in);
        int a,b;
        a=cal.nextInt();
        b= cal.nextInt();
        char ch;
        ch=cal.next().charAt(0);
        switch (ch)
        {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("enterd wrong operator");
                break;
        }

    }
}
