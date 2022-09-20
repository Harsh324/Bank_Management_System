//import java.util.*;

/**
 * Abstract class acting as base class
 */
abstract class Account 
{
    private String Name, Phone, Email, Address, Account_Type;
    protected double Balance;

    public Account(String name, String Phone, String Email, String Address, String Account_Type, Double Balance)
    {
        this.Name = name;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.Account_Type = Account_Type;
        this.Balance = Balance;
    }

    public String get_Name()
    {
        return this.Name;
    }

    public String get_Phone()
    {
        return this.Phone;
    }

    public String get_Email()
    {
        return this.Email;
    }

    public String get_Address()
    {
        return this.Address;
    }

    public String get_AccountType()
    {
        return this.Account_Type;
    }

    abstract void deposit(double D);
    abstract void withdraw(double W);
    abstract double balanceEnquiry();

}
