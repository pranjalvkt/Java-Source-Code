public class MainPrinter
{
    public static void main(String[] args) {
        
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count is " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}