public class MainHamburger
{
    public static void main(String[] args) {
        
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition12("Letuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.121);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }
}