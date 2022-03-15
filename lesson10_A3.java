import java.util.*;
class lesson10_A3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, s = 0, c;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c = 0;
            for(j = 1; j <n ; j++)
            {
                if(n % j == 0)
                    c += j;
            }
            if(c == n)
                s += n;
        }
        if(s > 0)
            System.out.println("Sum of perfect numbers: " +s);
        else
            System.out.println("No perfect numbers present");
    }
}