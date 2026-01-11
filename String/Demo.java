

public class Demo {

    public static void main(String[] args) 
    {
        String n = "ShivamDesai";
        System.out.println(n);

        String name = "Shivam";
        String name2 = "Shivam";
        System.out.println(name);
        System.out.println(name.hashCode());
        

        System.out.println(name2);
        System.out.println(name2.hashCode());

        System.out.println("We are changing value of n");
        n = n + "SSD";
        System.out.println( n);
        
    }
}
