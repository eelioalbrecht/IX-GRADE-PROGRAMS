/*Write a program to pass an integer as argument and check whether all digits 
in it are even digit or not.*/
class lesson9_32
{
    public static void main(int a)
    {
        int i, d, f = 0;
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            if (d % 2 != 0)
                f = 1;
        }
        if (f == 0)
            System.out.println("All digits are even");
        else 
            System.out.println("All numbers are not even");
    }
}