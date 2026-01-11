public class DemoStrBuff 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Shivam");
        System.out.println(sb);

        sb.append(" Desai");
        System.out.println(sb);

        for(int i = 0; i<sb.length();i++)
        {
            System.out.println(sb.charAt(i));
        }

        sb.insert(0, "Java ");
        System.out.println(sb);

        sb.insert(5,"new ");
        System.out.println(sb);
    }
    
}
