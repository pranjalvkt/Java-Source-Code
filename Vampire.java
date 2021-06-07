public class Vampire extends Enemy
{

    public Vampire(String name, int hitPoint) {
        super(name, hitPoint, 3);
    }

	@Override
    public void takeDamage(int damage)
    {
        int damageDone = damage / 2;
        super.takeDamage(damageDone);
    }

    // @Override
    // public void takeDamage(int damage)
    // {
    //     int hitPoint = getHitPoint();
    //     hitPoint = hitPoint - (damage / 2);
    //     setHitPoint(hitPoint);
    // }
    
}