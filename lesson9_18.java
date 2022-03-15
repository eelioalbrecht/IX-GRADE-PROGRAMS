import java.util.*;
class lesson9_18
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, f = 0, p = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <=10; i++)
        {
            n = sc.nextInt();
            if(i > 1)
            {
                if(n < p)
                    f = 1;
            }
            p = n;
        }
        if(f == 0)
            System.out.println("The numbers are in ascending order");
        else
            System.out.println("The numbers are not in ascending order");
    }
}