
public class DemoCalc 
{
    public static void main(String[] args) 
    {

        AdvCalc C1 = new AdvCalc();

        int r1 = C1.add(4,5);
        int r2 = C1.sub(5,4);
        int r3 = C1.div(5,4);
        int r4 = C1.mul(5,4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
    
}
