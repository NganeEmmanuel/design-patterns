//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Jack", "Dog", new CantFly());
        Animal bird = new Bird("Birdy", "Bird", new ItFlys());
        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());
    }
}