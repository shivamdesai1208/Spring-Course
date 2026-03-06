interface A{
    void show(int i);
}

// class B implements A
// {
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class DemoFunctionalInterface {

    public static void main(String[] args) {
        A obj = i -> System.out.println("in show");

         obj.show(5);
    }
    
}

