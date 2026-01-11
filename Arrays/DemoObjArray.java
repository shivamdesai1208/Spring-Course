class Student
{
    int rollNumber;
    String studName;
    int marks;
    
}


public class DemoObjArray 
{
    public static void main(String[] args) 
    {

        Student S1 = new Student();
        S1.rollNumber = 1;
        S1.studName = "Rahul";
        S1.marks = 97;

        Student S2 = new Student();
        S2.rollNumber = 2;
        S2.studName = "Mahes";
        S2.marks = 95;

        Student S3 = new Student();
        S3.rollNumber = 3;
        S3.studName = "Kiran";
        S3.marks = 90;
        
        //System.out.println(S1.rollNumber + " " + S1.studName);

        Student students[] = new Student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for (int i = 0; i<students.length; i++)
        {
            System.out.println(students[i].rollNumber + "|" + students[i].studName + "|" + students[i].marks);
            
        }




        // int nums[] = new int [6];

        // nums[0]= 4;
        // nums[1]= 5;
        // nums[2]= 3;
        // nums[3]= 8;

        // for(int i = 0; i<nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }
        
    }
    
}
