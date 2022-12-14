import java.io.IOException;
import java.util.*;


class Interface
{
    //private static Bank Bk;
    protected static Admin Adm;
    protected static Customer Cstm;
    protected static Scanner sc;

    public static void main(String[] args) throws IOException 
    {

        sc = new Scanner(System.in);
        System.out.println("\nWelcome to Bank\n");

        while(true)
        {
            System.out.println("\nif Admin Enter 1\nif Customer Enter 2 : ");
            int Num = sc.nextInt();
            sc.nextLine();

            if(Num == 1)
            {
                Adm = new Admin("Sar", "Ras");
                while(true)
                {
                    System.out.println(
                        "\nEnter 1 to open Account\nEnter 2 to get All Account Details\nEnter 3 to Print Customer details\n"
                        + "Enter 4 to print Transaction Details\nEnter 5 to Exit : ");
                    Num = sc.nextInt();
                    sc.nextLine();
                    if(Num == 1)
                    {
                        // System.out.println("Enter the Customer details");
                        // Adm.Get_Details();

                        if(Adm.Validate())
                        {
                            Adm.Take_Account_Type();
                        }

                        else
                        {
                            int Val = 2;
                            while(Val != 1)
                            {
                                System.out.println("\nEnter the Customer details\n");
                                Adm.Take_Details();
                                System.out.println("\nReview the details once\n");
                                Adm.Review_Details();
                                System.out.println("\nEnter 1 to confirm\nEnter 2 to Enter again");
                                Val = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        Adm.Open_Account();
                    }

                    
                    else if(Num == 2)
                    {
                        System.out.println("\nPrinting all the details\n");
                        Adm.Print_Account_Details();
                    }

                    else if(Num == 3)
                    {
                        System.out.println("\nPrinting Customer Details");
                        Adm.Print_Customer_Details();
                    }

                    else if(Num == 4)
                    {
                        System.out.println("\nPrinting Transaction details");
                        Adm.Print_Transaction_Details();
                    }
                    else if(Num == 5)
                        break;
                }
                
            }
            else if(Num == 2)
            {
                Cstm = new Customer("Cur", "Ruc");
                Cstm.Load_Customer();
                Cstm.Load_Account();
                while(true)
                {
                    System.out.println("\nEnter 1 to Deposit Money\nEnter 2 to Withdraw Money\n"
                    + "Enter 3 to Check Balance\nEnter 4 to print Details\nEnter 5 to break : ");
                    Num = sc.nextInt();
                    sc.nextLine();
                    if(Num == 1)
                    {
                        Cstm.Deposit_Money();
                    }
                    else if(Num == 2)
                    {
                        Cstm.Withdraw_Money();
                    }
                    else if(Num == 3)
                    {
                        Cstm.Check_Balance();
                    }
                    else if(Num == 4)
                    {
                        Cstm.Check_Details();
                    }
                    else if(Num == 5)
                    {
                        Cstm.Load_to_Database();
                        break;
                    }
                }
                
            }
        }

    }
}