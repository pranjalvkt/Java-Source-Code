public class Bank
{
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank()
    {
        this("56789", 2.50, "Default Name", "Deafault Address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Bank(String number, double balance, String customerName, String email, String phoneNumber)
    {
        System.out.println("Account constructor with parameter called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber)
    {
        this("99999", 10.55, customerName, email, phoneNumber);
    }



    

    // METHOD FOR DEPOSIT
    
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " is successfull. New balance is " + this.balance);
    }

    // METHOD FOR WIthRAWAL

    public void withrawal(double withrawalAmount)
    {
        if(this.balance - withrawalAmount < 0)
        {
            System.out.println("Only " + this.balance + " available . withrawal not possible ");
        }
        else
        {
            balance -= withrawalAmount;
            System.out.println("Withrawal of " + withrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumbetr()
    {
        return phoneNumber;
    }

    public void setPhonenumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }




}