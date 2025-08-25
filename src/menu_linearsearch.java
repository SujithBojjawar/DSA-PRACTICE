import java.util.*;
public class menu_linearsearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String tiffins[] = {"dosa","idli","wada","cholebhature","pongadalu","poori","dokla","tea","coffee"};
        System.out.println("enter your tiffin");
        String item;
        item = sc.next();
        int index = linearsearch(tiffins,item);
        if(index == -1)
        {
            System.out.println("tiffin not found");
        }
        else {
            System.out.println("tiffin found");
        }
    }
    public static int linearsearch(String tiffins[],String item)
    {
        for(int i=0;i<tiffins.length;i++)
        {
            if(tiffins[i].equals(item))
            {
                return i;
            }
        }
        return -1;
    }
}
