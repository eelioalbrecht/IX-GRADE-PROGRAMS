class Output4
{
    public static void main()
    {
        int a = 12, b = 13, c;
        c = a++ + ++a / 7;
        System.out.println(a+"\t"+b+"\t"+c);
        c = ++a + a++ / 3 + ++b;
        System.out.println(a+"\t"+b+"\t"+c);
    }
}