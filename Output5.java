class Output5
{
    public static void main()
    {
        int a = 12, b = 13;
        boolean c;
        c = a++ > b++;
        System.out.println(a+"\t"+b+"\t"+c);
        c = ++a < --b;
        System.out.println(a+"\t"+b+"\t"+c);
    }
}