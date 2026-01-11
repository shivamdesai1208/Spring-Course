
class Computer
{
    public void playMusic()
    {
        System.out.println("Music is Playing");
    }

    public String getMePen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        return "Value of Pen is more than Rs. 10";
    }
}


class Hello
{
    public static void main(String args[])
    {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
        
    }
}