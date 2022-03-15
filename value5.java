class value5
{
    public static void main()
    {
        int a = 12, b = 13, c = 11;
        b += --c + ++c + a++ + (b++);
        System.out.println(b);
    }
}