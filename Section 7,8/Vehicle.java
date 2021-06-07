public class Vehicle
{
    private int engine;
    private int wheels;
    private int doors;
    private int seats;

    public Vehicle(int engine, int wheels, int doors, int seats) // Constructor
    {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.seats = seats;
    }

    
    public int getEngine()
    {
        return engine;
    }

    public int wheels()
    {
        return wheels;
    }

    public int doors()
    {
        return doors;
    }

    public int seats()
    {
        return seats;
    }

    public void steer(String direction)
    {
        System.out.println("Heading towards " + direction + " direction");
    }

    public void gear(int gear)
    {
        System.out.println("Changing gear to " + gear);
    }

    public void speed(String changeSpeed)
    {
        System.out.println("Speed of vehicle is " + changeSpeed);
    }
}