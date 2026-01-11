//package Methods;

class GreaterNumber
{
    public int greaterAmongThree(int n1, int n2, int n3)
    {
        if ((n1 > n2) && (n1 > n3))
        {
            return n1;
        }
        else if ((n2 > n3) && (n2 > n3))
        {
            return n2;
        }
        else
        {
            return n3;
        }
    }
}

class Greater {

    public static void main(String args[])
    {
        GreaterNumber obj = new GreaterNumber();
        int str = obj.greaterAmongThree(5,38,23);
        System.out.println(str);

    }
    
}
