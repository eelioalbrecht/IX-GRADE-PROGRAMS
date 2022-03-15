/*Write a program to pass an integer as argument and check whether it is 
Armstrong number or not. Numbers whose sum of the cube of its digit is equal 
to the number itself is called Armstrong numbers. Example 153=1^3+5^3+3^3.*/
class lesson9_34
{
    public static void main(int a)
    {
        int i, d, s = 0;
        for(i = a; i > 9; i /= 10)
        {
            d = i % 10;
            s += Math.pow(d,3);
        }
        if(s == a)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}