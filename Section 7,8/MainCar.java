public class MainCar
{
    public static void main(String[] args) {
        
        Car porche = new Car();
        Car holden = new Car();
        porche.setModel("911");
        System.err.println("model is " + porche.getModel());

    }
}