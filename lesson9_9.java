import java.util.*;
class lesson9_9
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.println("Enter 10 Interger: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            s = s + n;
        }
        //System.out.println("OUTPUT OF LESSON 9- 9");
        System.out.println("Sum of the numbers: " +s);
    }
}