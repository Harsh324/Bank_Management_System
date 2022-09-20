public class loanAccount extends Account
{
    private double Principal_amt;
    private float Loan_Interest_Rate;

    public loanAccount(String name, String Phone, String Email, String Address, String Account_Type, Double Balance, float Loan_Interest_Rate, Double Principal_Amt)
    {
        super(name, Phone, Email, Address, Account_Type, Balance);
        this.Loan_Interest_Rate = Loan_Interest_Rate;
        this.Principal_amt = Principal_Amt;

    }

    void deposit(double D) 
    {
        Principal_amt -= D;
        
    }

    void withdraw(double W) 
    {
        Principal_amt += W;
        
    }

    double balanceEnquiry() 
    {
        return Principal_amt;
    }

    double get_Principal()
    {
        return this.Principal_amt;
    }

    public void Interest_Addition()
    {
        double Interest = (Principal_amt) * (Loan_Interest_Rate);
        Principal_amt += Interest;
    }
}
