import java.util.*;
public class passing_array_as_arguement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int marks[] = new int[n];
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }
        update(marks,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    public static void update(int marks[],int n)
    {
        for(int i=0;i<n;i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
