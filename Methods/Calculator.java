
class Calc
{
    public void displayName()
    {
        System.out.println("You are in Calc class");
    }

    public int Addition(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public int Substration(int a, int b)
    {
        int sub = a - b;
        return sub;
    }

    public int Division(int a, int b)
    {
        int div = a / b;
        return div;
    }

    public int Multiplication(int a, int b)
    {
        int mul = a * b;
        return mul;
    }
}



public class Calculator
{
    public static void main(String args[])
    {
        System.out.println("Hello");
    

    Calc obj = new Calc();
    obj.displayName();

    int add = obj.Addition(10, 5);
    System.out.println("Addition of 10 and 5 is : " + add);

    int sub = obj.Substration(10, 5);
    System.out.println("Substration of 10 and 5 is : " + sub );

    int div = obj.Division(10, 5);
    System.out.println("Division of 10 and 5 is : " + div);

    int mul = obj.Multiplication(10, 5);
    System.out.println("Multiplication of 10 and 5 is : " + mul);


    }

}