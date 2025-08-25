import java.util.*;
public class sumofevenorodd {
    public static void main(String [] args)
    {
        Scanner sum = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsem = 0;
        do {
            System.out.println("enter the numbers");
            number = sum.nextInt();
            if(number % 2 == 0)
            {
                evensum += number;
            }
            else {
                oddsem += number;
            }
            System.out.println("do you want tp continue  ? press 1 for yes  or 0 for no");
            choice = sum.nextInt();
        } while(choice ==1);
            System.out.println("sum of even numbers"+evensum);
            System.out.println("sum of odd numbers"+oddsem);
    }
}
