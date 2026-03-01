class ShivamException extends Exception
{
    public ShivamException(String string)
    {
        super(string);
    }
}

public class Demo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int nums [] = new int[5];

        String str = null;

        try{
            j = 18/20;
            if (j == 0)
                throw new ShivamException("I dont want  to print zero");

            System.out.println(nums[1]);
            System.out.println(nums[0]);
            System.out.println(str.length());
        }
        catch(ShivamException e){
            System.out.println("Cannot divide by zero." + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
