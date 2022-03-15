import java.util.*;
class lesson9_8
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0;
        System.out.println("Enter an Interger: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }
        //System.out.println("OUTPUT OF LESSON 9- 8");
        if(c == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}   