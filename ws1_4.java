import java.util.*;
class ws1_4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n, num, last, sum = 0;
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        num = n;
        while (n > 0)
        {
            last = n % 10;
            int fact = 1;
            for (int i = 1; i <= last; i++)
            {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(num == sum)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }
}