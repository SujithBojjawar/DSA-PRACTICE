import java.util.*;
public class product_of_aandb_using_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int product = multiply(a,b);
        System.out.println(product);
    }
    public static int multiply(int a,int b)
    {
        int product = a*b;
        return product;
    }
}
