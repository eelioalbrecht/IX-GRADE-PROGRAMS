import java.util.*;
class lesson9_16
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, f = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1;i <= 10; i++)
        {
            n = sc.nextInt();
            if(n % 2 != 0)
                f = 1;
        }
        if(f == 0)
            System.out.println("All are even numbers");
        else
            System.out.println("All are not even numbers");
    }
}