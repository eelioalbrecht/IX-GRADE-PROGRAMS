/*Question*/
import java.util.*;
class final9
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0;
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
    void number()
    {
        final9 obj = new final9();
        obj.number();
    }
}