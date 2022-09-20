public class SavingAccount extends Account
{
    private double Saving_Interest_Rate;


    public SavingAccount(String name, String Phone, String Email, String Address, String Account_Type, double Balance, double Saving_Interest_Rate)
    {
        super(name, Phone, Email, Address, Account_Type, Balance);
        this.Saving_Interest_Rate = Saving_Interest_Rate;
    }

    void deposit(double D) 
    {
        Balance += D;
        
    }

    void withdraw(double W)
    {
        if(Balance - W >= 0)
        {
            Balance -= W;
        }
        else
            System.out.println("Can't Initiate Withdrawl ! , Not Sufficient Balance");
        
    }

    double balanceEnquiry()
    {
        return Balance;
    }

    public void Add_Interest()
    {
        double Interest = (Balance) * (Saving_Interest_Rate / 100);
        Balance += Interest;
    }
}