import org.example.Animal;

public class Main {
    public static void main(String[] args) {
        // Dog nesnesi
        Animal.Dog dog = new Animal.Dog();
        dog.setName("Buddy");
        System.out.println("Dog's Name: " + dog.getName());
        System.out.println(dog.sound());
        dog.sleep();

        // Lion nesnesi
        Lion lion = new Lion();
        System.out.println(lion.sound());
        System.out.println("Lion's Habitat: " + lion.habitat());
        lion.sleep();

        // Parrot nesnesi
        Parrot parrot = new Parrot();
        parrot.setName("Polly");
        System.out.println("Parrot's Name: " + parrot.getName());
        System.out.println(parrot.sound());
        System.out.println("Parrot's Habitat: " + parrot.habitat());
        parrot.sleep();
    }
}