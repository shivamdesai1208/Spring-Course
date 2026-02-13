import tools.*;

public class DemoCalc 
{
    public static void main(String[] args) 
    {

        VeAdvCalc C1 = new VeAdvCalc();

        int r1 = C1.add(4,5);
        int r2 = C1.sub(5,4);
        int r3 = C1.div(5,4);
        int r4 = C1.mul(5,4);
        double r5 = C1.power(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        System.out.println("Temp line");
    }
    
}
