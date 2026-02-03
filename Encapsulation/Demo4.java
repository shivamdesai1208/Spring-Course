class Student
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class Demo4 
{
    public static void main (String a[])
{
    Student S1 = new Student();

    S1.setId(1001);
    S1.setName("Shivam");

    System.out.println(S1.getId());
    System.out.println(S1.getName());

    System.out.println("Hello");

}
    
}


