/*Give the output of the program:*/
class pg111five
{
    public static void main(int a, int b)
    {
        int s = 0;
        s+= (a > 0)? a : -b;
        s-= (a < 0)? -a : +b;
        System.out.println(s);
    }
}
/*When
a. a=-5 and b=-6
b. a=5 and b=6*/