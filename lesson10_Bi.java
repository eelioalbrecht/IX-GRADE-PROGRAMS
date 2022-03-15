import java.util.*;
class lesson10_Bi
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double s = 0;
        int i, j ,x, n, f;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            f = 1;
            for (j = 1; j <= i; j++)
                f *= j;
            s += Math.pow(x, i) / f;
        }
        System.out.println("Sum: " +s);
    }
}