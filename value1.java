class value1
{
    public static void main()
    {
        int a = 12, b = 13, c = 11;
        a = a++ + --b + c++;
        System.out.println(a);
    }
}