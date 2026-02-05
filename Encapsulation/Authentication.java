class Details
{
    private String userName;
    private String password;
    static String companyName;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void show1()
    {
        System.out.println(userName + " : " + password + " : " + companyName);
    }

    public Details()
    {
        userName = "aaaa";
        password = "123aa";
        companyName = "StartUpShivam";
    }

    public Details(String uN, String pW, String cN)
    {
        userName = uN;
        password = pW;
        companyName = cN;
    }

}

public class Authentication 
{
    public static void main(String[] args) 
    {

        Details D1 = new Details(); 
        Details D2 = new Details("Shivam1208", "shivam111", "NewShivam"); 
        Details D3 = new Details("Ramyata0801", "ramyata111", "NewShivam"); 

        D1.show1();
        D2.show1();
        D3.show1();

        
    }
}