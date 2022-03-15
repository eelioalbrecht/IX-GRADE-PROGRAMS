import java.util.*;
class lesson10_Bii
{
    public static void main(String [] args)
    {
        int i, j, x, n, f;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            f = 1;
            for (j = 1; j <= i + 1; j++)
                f *= j;
            s = s + Math.pow(x, i) / f;
        }
        System.out.println("Sum: " +s);
    }
}