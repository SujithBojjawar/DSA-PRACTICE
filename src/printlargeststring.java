import java.util.*;
public class printlargeststring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"apple","mango","banana",};
        String largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(largest.compareTo(arr[i])<0)
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);
        StringBuilder sb = new StringBuilder("");
        for(char i='a';i<='z';i++)
        {
            sb.append(i);
        }
        System.out.println(sb);  //o(26)
    }
}
