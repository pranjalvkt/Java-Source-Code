public class MainAnimal
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        DogAnimal dog = new DogAnimal("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        FishAnimal fish = new FishAnimal("gold", 5, 5, 2, 2, 2);

        dog.eat();
        dog.walk();
        dog.run();

        fish.rest();

    }
}