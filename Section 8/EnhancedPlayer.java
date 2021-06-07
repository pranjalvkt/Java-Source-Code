public class EnhancedPlayer
{
    public String name;
    public int hitPoint = 100;
    public String weapon;

    public EnhancedPlayer(String name, int health, String weapon)
    {
        this.name = name;
        if(health > 0 && health <= 100)
        {
            this.hitPoint = health;
        }
        this.weapon = weapon;
    }
    


    public void loseHealth(int damage)
    {
        this.hitPoint = this.hitPoint - damage;
        if(this.hitPoint <= 0)
        {
            System.out.println("Player knocked out");
            // reduce life
        }
    }

    public int getHealth()
    {
        return hitPoint;
    }
    
}