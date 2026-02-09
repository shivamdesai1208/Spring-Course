class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int a)
    {
        super();
        System.out.println("in A int");
    }


}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int a)
    {
        this();
        System.out.println("in B int");
    }

}
public class DemoABC 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");

        B obj = new B(12);

        
    }
    
}
