public class MainBank
{
    public static void main(String[] args) 
    {
        Bank bobsAccount = new Bank(); //("8122", 0.00, "Bob Brown", "myemail@gmail.com", "1234");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        // bobsAccount.setNumber("8122");
        // bobsAccount.setCustomerName("Bob Brown");
        // bobsAccount.setEmail("myemail@gmail.com");
        // bobsAccount.setPhonenumber("1234");


        bobsAccount.withrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withrawal(100.0);

        Bank timsAccount = new Bank("Tim", "tim@email", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withrawal(10.55);
        

    }
}