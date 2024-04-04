public class Cat extends animal {
    public Cat(String name, int age) {

        super(name, age, "Cat");


    }

    @Override

    public void printCommands() {

        System.out.println("Commands for Cat: Sleep, Meow, Scratch");
    }


}