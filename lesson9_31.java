/*Write a program to input an integer and remove all the even digits from it.
For Example,
    INPUT: Enter an integer: 1234
    OUPUT: 13*/
class lesson9_31
{
    public static void main(int a)
    {
        int i, d, s = 0, c = 0;
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            if (d % 2 != 0)
                s += d * (int)Math.pow(10, c++);
        }
        System.out.println("New Number: " +s);
    }
}