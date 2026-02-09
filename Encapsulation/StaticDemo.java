class Phones
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Phones obj)
    {
        System.out.println("Inside static method");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticDemo 
{
    public static void main(String[] args) 
    {

        Phones P1 = new Phones();
        P1.brand = "Apple";
        P1.price = 1500;
        Phones.name = "Phone";

        Phones P2 = new Phones();
        P2.brand = "Samsung";
        P2.price = 1700;
        Phones.name = "Smart Phone";

        P1.show();
        P2.show();

        System.out.println();

        Phones.show1(P1);
        
    }

    
}
