class value4
{
    public static void main()
    {
        int a = 12, b = 13, c = 11;
        b = b++ + ++b + c++ + ++a;
        System.out.println(a);
    }
}