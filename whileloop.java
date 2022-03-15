import java.util.*;
class whileloop
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, odd, even;
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        odd = 0;
        even = 0;
        int i = 1;
        while (i <= n)
        {
            if(i %2 == 0)
                even += i;
            else
                odd += i;
        }
        System.out.println("Sum of Even Numbers: " +even);
        System.out.println("Sum of Odd Numbers: " +odd);
    }
}