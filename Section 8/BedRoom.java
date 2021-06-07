public class BedRoom
{
    private String name;
    
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling Ceiling, Bed bed, Lamp lamp)
    {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;


    }

    public void makeBed()
    {
        System.out.println("Bedroom --> Making bed");
        bed.make();
    }

    // public Wall getWall1()
    // {
    //     return wall1;
    // }

    // public Wall getwall2()
    // {
    //     return wall2;
    // }

    // public Wall getwall3()
    // {
    //     return wall3;
    // }

    // public Wall getwall4()
    // {
    //     return wall4;
    // }



    public Lamp getLamp()
    {
        return lamp;
    }

}