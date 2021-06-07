public class VampyreKing extends Vampire
{

    public VampyreKing(String name) {
        super(name, 140);
    }



    // public VampyreKing(String name) {
    //     super(name);
    // }
    
    @Override
    public void takeDamage(int damage)
    {
        int damageDone = damage / 4;
        super.takeDamage(damageDone);
    }


}