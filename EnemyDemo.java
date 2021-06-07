public class EnemyDemo
{
    public static void main(String[] args) {
        // Enemy enemy = new Enemy("test enemy", 10, 3);
        // enemy.showInfo();

        // enemy.takeDamage(3);
        // enemy.showInfo();

        // enemy.takeDamage(11);
        // enemy.showInfo();
        Troll uglyTroll = new Troll("Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);
        uglyTroll.showInfo();

        Vampire vampire = new Vampire("doreo", 20);
        vampire.showInfo();
        vampire.takeDamage(8);
        vampire.showInfo();

        VampyreKing vampyreKing = new VampyreKing("Diego");
        vampyreKing.showInfo();
        vampyreKing.takeDamage(8);
        vampyreKing.showInfo();
    }
}