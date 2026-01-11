class Sum
{
    public int addTwoNumber(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public int addThreeNumber(int c, int d, int e)
    {
        int sum = c + d + e;
        return sum;
    }

    public int addFourNumber(int f, int g, int h, int i)
    {
        int sum = f + g + h + i;
        return sum;
    }
}


public class SumOfNumbers 
{
    public static void main (String args[])
    {

        Sum obj = new Sum();

        //To print two numbers
        int sum2 = obj.addTwoNumber(4,5);
        System.out.println(sum2);

        //To add three numbers
        int sum3 = obj.addThreeNumber(4,5,6);
        System.out.println(sum3);

        //To add four numbers
        int sum4 = obj.addFourNumber(4, 5, 6, 7);
        System.out.println(sum4);


        
    }
}
