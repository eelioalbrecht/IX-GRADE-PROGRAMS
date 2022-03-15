import java.util.*;
class lesson10_Biii
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, x, n, f;
        double s = 0;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            f = 1;
            for (j = 1; j <= i; j++)
            f *= j;
            s = s + Math.pow(x, i + 1) / f;
        }
        System.out.println("Sum: " +s);
    }
}