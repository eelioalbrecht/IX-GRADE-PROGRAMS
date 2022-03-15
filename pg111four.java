/*Give the output of the program:*/
class pg111four
{
    public static void main()
    {
        int a = 5, b = 6, c = 3;
        c+= a / 2 + b % 8 + c;
        System.out.println(c);
        c-= a - b * 2 + c * 3;
        System.out.println(c);
    }
}
/*
c+= a / 2 + b % 8 + c;
= c + (a / 2 +b%8+c)
=3+(5/2+6%8+3)
=3+(2+6%8+3)
=3+(2+6+3)
=14

c-= a - b * 2 + c * 3;
=c-(a - b * 2 + c * 3)
=14-(5-6*2+14*3)
=14-(5-12+14*3)
=14-(5-12+42)
=14-(5+30)
=14-35
=-21*/