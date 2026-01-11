public class DemoArray {

    public static void main(String[] args) {
        
        int num[] = {3,5,6,7};

        System.out.println(num[2]);
        System.out.println("--------------");

        int b = num.length;

        System.out.println("Length of previous Array : " + b );
    

        

        for (int m=0; m < b; m++)
        {
            System.out.println(num[m]);
        }

        System.out.println("Line 19");

        System.out.println("Appending new number at position 2");

        num[2] = 8;

        System.out.println(num[2]);



        System.out.println("--------------");

        int a = num.length;

        System.out.println("Length of an Array : " + b);
        System.out.println("Write code");
    

        for (int n=0; n < a; n++)
        {
            System.out.println(num[n]);
        }
    }
}
