class Calc
{

    public void show()
    {
        System.out.println("Inside show method");
    }

}

public class DemoCalc 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main method");
        Calc C1 = new Calc();
        C1.show();

        
    }
    
}
