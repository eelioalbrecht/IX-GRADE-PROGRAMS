/*Write a program to find the sum of the following series:
S=1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+…+(1+2+3+4+…+10)
(Please note that no nested loop is to be used)*/
class lesson9_44
{
    public static void main(String [] args)
    {
        int i, s = 0, p = 0;
        for(i = 1; i <= 10; i++)
        {
            p += i;
            s += p;
        }
        System.out.println("Sum: " +s);
    }
}