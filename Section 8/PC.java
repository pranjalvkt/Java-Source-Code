public class PC
{
    private Case theCase;
    private Moniter theMoniter;
    private Motherboard theMotherboard;

    public PC(Case theCase, Moniter theMoniter, Motherboard theMotherboard)
    {
        this.theCase = theCase;
        this.theMoniter = theMoniter;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        // fancy graphics
        theMoniter.drawPixelAt(1200, 50, "yellow");
    }

}