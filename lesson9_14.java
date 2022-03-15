import java.util.*;
class lesson9_14
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0, l = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            if(n % 2 == 0)
            {
                c++;
                if(c == 1)
                    l = n;
                if( n > l)
                    l = n;
            }
            if(c > 0)
                System.out.println("Largest Even Number: " +l);         
            else
                System.out.println("No even integer found");
        }
    }
}