/*Give the output of the program:*/
class pg110two
{
    public static void input(int a, int b)
    {
        int c, d;
        c = (++a) + (b++);
        d = (a--) - (--b);
        System.out.println(c+" "+d);
    }
}
/*When:
a. a=12 and b=13 is taken as parameters.
b. a=9 and b=4 is taken as parameters*/