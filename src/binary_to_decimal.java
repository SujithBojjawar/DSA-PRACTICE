import java.util.*;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        binTodec(n);
    }

    public static void binTodec(int n) {
        int decnum = 0;
        int power = 0;
        int original = n;

        while (n > 0) {
            int ld = n % 10;  // Extract the last digit
            decnum = decnum + (ld * (int)(Math.pow(2, power)));  // Convert to decimal
            power++;
            n = n / 10;  // Remove the last digit
        }

        System.out.println("Decimal of " + original + " = " + decnum);
    }
}
