import java.util.*;
public class fever {
    public static void main(String[] args)
    {
        Scanner temp = new Scanner(System.in);
        double degrees = 103.5;
        if(degrees > 100)
        {
            System.out.println("you have a fever");
        }
        else {
            System.out.println("you are normal");
        }
    }

}
