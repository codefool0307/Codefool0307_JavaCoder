public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        Dog dog=(Dog) animal;
        dog.eat();
    }
}
