import java.util.*;
public class loop1 {
    public static void main(String[] args)
    {
        for(int i=0;i<30;i=i++)
        {
            if(i%2==0)
            {
                i++;
            }
            else {
                System.out.println(i);
                i++;
            }
        }
    }
}
