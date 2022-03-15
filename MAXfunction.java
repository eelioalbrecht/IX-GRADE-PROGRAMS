import java.util.*;
class MAXfunction
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int m, v;
        System.out.println("MAXIMUM OF NUMBERS");
        System.out.println("Enter First Number");
        m = sc.nextInt();
        System.out.println("Enter Second Number");
        v = sc.nextInt();
        double result = Math.max(m, v);
        System.out.println("Result: " +result);
    }
}