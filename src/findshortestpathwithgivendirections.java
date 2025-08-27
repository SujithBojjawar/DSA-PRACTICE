import java.util.*;
public class findshortestpathwithgivendirections {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String way;
        way = sc.next();
        int x=0,y=0;
        for(int i=0;i<way.length();i++)
        {
            if(way.charAt(i) == 'n')
            {
                y++;
            }
            else if(way.charAt(i) == 'e')
            {
                x++;
            }
            else if(way.charAt(i)== 's')
            {
                y--;
            }
            else {
                x--;
            }
        }
        int xx = x*x;
        int yy = y*y;
        int sd = 0;
        sd = (int)Math.sqrt(xx+yy);
        System.out.println(sd);
    }
}
