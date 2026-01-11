class Intrest
{
    public float calcIntrest(float amt, float yy, float roi)
    {
        float totalAmt = 0;
        if (amt == 0)
        {
            System.out.println("The amount entered is 0");
            return totalAmt;
        }
        else
        {
            float intr = amt*roi*yy/100;
            totalAmt = amt + intr;
            return totalAmt;
        }

    }

}

public class SimpleIntrestCalculator 
{
    public static void main(String args[])
    {
        Intrest obj = new Intrest();
        float value = obj.calcIntrest(100,5,10);
        System.out.println("Total Value : " + value);
    }
}