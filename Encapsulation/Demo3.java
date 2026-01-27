class Student
{
    private int rollNumber;
    private String name;


    public int getRollNumber() 
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) 
    {
        this.rollNumber = rollNumber;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    
}


public class Demo3 
{
    public static void main(String[] args) 
    {
        System.out.println("Encapsulation example");

        Student std1 = new Student();
        std1.setRollNumber(1);
        std1.setName("Shivam");
        

        Student std2 = new Student();
        std2.setRollNumber(2);
        std2.setName("Abhimanyu");

        System.out.println(std1.getRollNumber() + " " + std1.getName());
        System.out.println(std2.getRollNumber() + " " + std2.getName());

        System.out.println("Hello WOrld");
        
    }
    
}
