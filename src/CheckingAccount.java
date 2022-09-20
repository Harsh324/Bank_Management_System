// import java.io.IOException;
// import java.util.*;

public class CheckingAccount extends Account
{
    private double creditlimit;

    public CheckingAccount(String name, String Phone, String Email, String Address, String Account_Type, Double Balance, Double Creditlimit)
    {
        super(name, Phone, Email, Address, Account_Type, Balance);
        this.creditlimit = Creditlimit;
    }

    void deposit(double D) 
    {
        Balance++;
    }

    void withdraw(double W)
    {
        if(Balance - W >= creditlimit)
        {
            Balance -= W;
        } 
        else
            System.out.println("Can't Initiate Withdrawl ! , Credit limit reached");
    }

    double balanceEnquiry()
    {
        return Balance;
    }
}