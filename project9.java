import java.util.*;
class project9
{
    public static void main(String[]args)
    {
        int num,fir,last,sum,pro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digit number: ");
        num = sc.nextInt();
        fir = (int) num/10;
        last = num % 10;
        sum = fir + last;
        pro = fir * last;
        sum = sum + pro;
        if(sum == num)
        System.out.println("Special two digit number");
        else
        System.out.println("Not special two digit number");
    }
}