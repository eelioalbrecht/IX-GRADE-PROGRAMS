import java.util.*;
class sotd
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int d, n, sum = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n > 0)
        {
            d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("Sum: " +sum);
    }
}