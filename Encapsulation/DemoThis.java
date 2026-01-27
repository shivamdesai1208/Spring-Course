
class Brain
{
    private int small;
    private String large;

    public int getSmall() {
        return small;
    }
    public void setSmall(int small) {
        this.small = small;
    }
    public String getLarge() {
        return large;
    }
    public void setLarge(String large) {
        this.large = large;
    }

    
    
}

public class DemoThis 
{
    public static void main(String[] args) 
    {
        System.out.println("----------------------");

        Brain bb = new Brain();
        bb.setSmall(23);
        bb.setLarge("MyBrain");

        System.out.println(bb.getSmall() + " " + bb.getLarge());
        System.out.println("Included new line");

        
    }
    
}
