class Car
{
    private int wheelsNumber;
    private String modelName;

    public void setwheelNumber(int wN)
    {
        wheelsNumber = wN;
    }

    public void setmodelName(String mN)
    {
        modelName = mN;
    }

    public int getwheelNumber()
    {
        return wheelsNumber;
    }

    public String getmodelName()
    {
        return modelName;
    }
}

public class Demo2 
{
    public static void main(String[] args) 
    {
        Car obj = new Car();
        obj.setwheelNumber(5);
        obj.setmodelName("Maruti");


        System.out.println(obj.getwheelNumber() + " " + obj.getmodelName());

    }
}
