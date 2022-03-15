import java.util.*;
class lesson9_10
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n=sc.nextInt();
            if(n % 2 == 0)
                s = s + n;
        }
        System.out.println("OUTPUT OF LESSON 9- 10");
        System.out.println("Sum of even numbers: " +s);
    }
}