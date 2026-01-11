public class DemoMultiArray 
{
    public static void main(String args[])
    {
        int nums[] [] = new int[3] [4];

        
        //System.out.println(Math.random());

        for(int n = 0; n < 3; n++)
        {
            for(int m = 0; m < 4; m++)
            {
                nums[n][m] = (int) (Math.random()*10);
                System.out.print(nums[n][m] + " ");
                //System.out.println(nums[n][m]);
            }
            System.out.println();
        }

        // System.out.println(nums[1][0]);
        // System.out.println(nums[1][1]);
        // System.out.println(nums[1][2]);
        // System.out.println(nums[1][3]);

        // System.out.println("Line 20");
        // for(int n = 0; n < 3; n++)
        // {
        //     for(int m = 0; m < 4; m++)
        //     {
        //         System.out.print(nums[n][m] + " ");
        //     }
        //     System.out.println();
        // }



    }
}
