public class Porche extends Vehicle
{

    private String colour;
    private String model;

    public Porche(String colour, String model) 
    {
        super(1, 4, 2, 2);
        this.colour = colour;
        this.model = model;
    }
	public void Ndirection()
    {
        steer("North");
    }

    public void geerOne()
    {
        gear(1);
    }
    public void geerTwo()
    {
        gear(2);
    }

    public void acceleration()
    {
        speed("Increasing");
    }

    public void retardation()
    {
        speed("Decreasing");
    }

}