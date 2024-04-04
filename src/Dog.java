public class Dog extends animal {

    public Dog(String name, int age) {

        super(name, age, "Dog");

    }

    @Override

    public void printCommands() {

        System.out.println("Commands for Dog: Sit, Stay, Fetch");

    }
}
