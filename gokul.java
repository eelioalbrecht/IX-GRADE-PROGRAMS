public class gokul
{
    public static void main(String[] args)
    {
        int num = 9965342;
        String numb = String.valueOf(num);
        int lastindex = numb.length() - 1;
        int firstindex = 0;
        boolean palindrome = true;
        while(firstindex != numb.length() - 1)
        {
            if(numb.charAt(firstindex) == numb.charAt(lastindex))
            {
                palindrome = true;
            }
            else
            {
                palindrome = false;
                break;
            }
            firstindex++;
            lastindex--;
        }
        if(palindrome)
        {
            System.out.println("This number is a Palindrome");
        }
        else
        {
            System.out.println("The number is not Palindrome");
        }
    }
}