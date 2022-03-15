class Output2
{
    public static void main()
    {
        int a = 12, b = 13, c = 6;
        c += a+b%2;
        b -= a+2*c;
        System.out.println(c);
        System.out.println(b);
    }
}