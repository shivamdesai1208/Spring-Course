public class Demo
{
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("Shivam");

        sb.append(" Desai");
        sb.insert(7, "Satyawan ");
        sb.insert(7, "S" );

        sb.deleteCharAt(7);
        System.out.println(sb);  

    }

}