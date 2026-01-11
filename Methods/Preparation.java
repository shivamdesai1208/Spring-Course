import java.util.ArrayList;
import java.util.List;

public class Preparation {

    public static void main(String[] args) {
        System.out.println("HELLO");

        // String operations-

        String s = "Shviam";
        System.out.println(s);

        s = s + "Hello";
        System.out.println(s);

        // String Builder-

        StringBuilder sb = new StringBuilder("Shivam");
        sb.append("Hello ");
        System.out.println(sb);

        System.out.println("------------------------");

        System.out.println("List");

        List<String> names = new ArrayList<>();
        names.add("Shivam");
        names.add("Anushka");
        names.add("Shivani");

        System.out.println("All the names in the list-");
        System.out.println(names);

        System.out.println("Second element in the list");
        System.out.println(names.get(1));


        System.out.println("Exception handling");
        try {
            int a = 10 / 2; // risky code
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Finally block always executes.");
        }

    }

}
