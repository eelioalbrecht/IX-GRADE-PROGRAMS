import java.util.*;
class lesson10_A11
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, s, d;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (s = 0; n > 9; n = s, s = 0)
        {
            for (i = n; i > 0; i /= 10)
            {
            d = i % 10;
            s += d;
            }
        }
        if(n == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}