import java.util.*;
class lesson9_11
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s2 = 0, s3 = 0;
        System.out.println("Enter 10 integers: ");
        
        for (i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            
            if(n >= 10 && n<= 99)
                s2 += n;
            if (n >=100 && n <= 999)
                s3 += n;
        }
        
        System.out.println("Sum of 2 digit numbers: " +s2);
        System.out.println("Sum of 3 digit numbers: " +s3);
    }
}