import java.util.Scanner;
class lesson10_A5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, s = 0, c, p = 0, l = 0;
        System.out.println("Enter 10 integers: ");
        for (i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c = 0;
            for(j = 1; j <= n; j++)
            {
                if(n % j == 0)
                    c++;
            }
            if(c == 2)
            {
                p++;
                if(p == 1)
                    l = n;
                if (n > l)
                    l = n;
            }
        }
        if(p > 0)
            System.out.println("Largest prime numbers: " +l);
        else
            System.out.println("No prime numbers present");
    }
}