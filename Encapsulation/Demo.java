class Human
{
    private int age;
    private String name;

    public void setAge(int a)
    {
        age = a;
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

}


public class Demo
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Shivam");

        System.out.println(obj.getAge() + " " + obj.getName());

    }
}