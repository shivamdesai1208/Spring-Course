//package Methods;

class Factorial
{
    public int findFact(int d)
    {
        if (d<0)
        {
            System.out.println("Factorial not possible for value " );
            return d;
        }
        else if(d<=1)
        {
            return 1;
        }
        else
        {
            int fact = 1;
            while (d > 1)
            {
                fact = (fact * d);
                d = (d-1);
            }
            return fact;

        }
    }

}

public class FactorialOfNumber 
{
    public static void main (String args[])
    {
        Factorial obj = new Factorial();
        int str = obj.findFact(4);
        System.out.println("Factorial of give number : " + str );
    }
    
}
