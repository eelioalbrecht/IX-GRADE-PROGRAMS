import java.util.*;
class ws1_5
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, count = 0, d;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n != 0) 
        {
            d = n % 10;
            sum += d;
            count++;
            n /= 10;
        }
        System.out.println("Sum of Digits: " +sum);
        System.out.println("Number of Digits: " +count);
    }
}