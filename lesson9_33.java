/*Write a program to pass an integer as argument and check whether the digits 
are in ascending order or not.*/
class lesson9_33
{
    public static void main(int a)
    {
        int i, d, d1, f = 0;
        for(i = a; i > 9; i /= 10)
        {
            d = i % 10;
            d1 = (i / 10) % 10;
            if (d < d1)
                f = 1;
        }
        if (f == 0)
            System.out.println("Digits are in ascending order");
        else
            System.out.println("Digits are not in ascending order");
    }
}