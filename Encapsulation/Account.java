class Details
{
    private long accountNumber;
    private long accountBalance;
    private String accountHolderName;

    public Details()
    {
        accountBalance = 1111;
        accountNumber = 1111;
        accountHolderName = "AAAA";
    }

    public Details(long aN, long aB, String hN)
    {
        accountBalance = aB;
        accountNumber = aN;
        accountHolderName = hN;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}

public class Account 
{
    public static void main(String a[])
    {
        Details D1 = new Details();
        Details D2 = new Details(1001, 10000, "Shivam");

        // D1.setAccountBalance(10000);
        // D1.setAccountNumber(1001);
        // D1.setAccountHolderName("Shivam");

        System.out.println("Account Details are as follows - ");
        System.out.println("Ac Number : " + D1.getAccountNumber());
        System.out.println("Ac Holder : " + D1.getAccountHolderName());
        System.out.println("Balance   : " + D1.getAccountBalance());

        System.out.println("------------------------------------------------");

        System.out.println("Ac Number : " + D2.getAccountNumber());
        System.out.println("Ac Holder : " + D2.getAccountHolderName());
        System.out.println("Balance   : " + D2.getAccountBalance());


        System.out.println("Hello");

    }
    
}
