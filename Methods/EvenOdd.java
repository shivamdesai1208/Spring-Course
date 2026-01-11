//package Methods;

class EvenOddCheck
{
    public boolean isEven(int n1)
    {
        if (n1%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

public class EvenOdd 
{
    public static void main(String args[])
    {
        EvenOddCheck obj = new EvenOddCheck();
        boolean str = obj.isEven(387663);

        System.out.println("Entered value is Even : " + str);
    }
}
