public class methodOverloading_usingPrameters {
    public static void main(String[] args)
    {
        System.out.println(sum(3,5));
        System.out.println(sum(5,5,5));
    }
    public static int sum(int a , int b)
    {
        return a+b;
    }
    public static int sum(int a , int b,int c)
    {
        return a+b+c;
    }
}
// if we came same names for functions by the diffrent parametrs it still works because in first one there are 3 parameters
// in second one there are 3 parameters its comes only we use diffrent data types
