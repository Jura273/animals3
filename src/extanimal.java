public class extanimal extends animal {

    public extanimal(String name, int age) {

        super(name, age, "Dog");

    }

    @Override

    public void printCommands() {

        System.out.println("Commands for Dog: Sit, Stay, Fetch");

    }
}