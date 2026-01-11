public class DemoArrayBlank 
{
    public static void main(String[] args) 
    {
        int nums[] = new int [4];

        System.out.println(nums[1]);

        int a = nums.length;

        for (int n = 0; n < a; n++)
        {
            System.out.println(nums[n]);
        }

        nums[0]= 3;
        nums[1]= 4;
        nums[2]= 5;
        nums[3]= 6;

        for (int n = 0; n < a; n++)
        {
            System.out.println(nums[n]);
        }
    }
}
