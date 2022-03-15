class result
{
    public static void main()
    {
        int x = 5;
        x = x++ * 2 + 3 * -x;
        System.out.println(x);
    }
}