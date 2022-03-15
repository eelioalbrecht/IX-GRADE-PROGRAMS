import java.util.*;
class lesson10_Bv
{
    public static void main(String [] args)
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
            for (j = 1; j <= i + 1; j++)
                f *= j;
            if(i % 2 == 1)
                s = s + Math.pow(x, i) / f;
            else
                s = s - Math.pow(x, i) / f;
        }
        System.out.println("Sum: " +s);
    }
}