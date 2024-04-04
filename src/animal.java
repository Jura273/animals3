public abstract class animal {

    protected  String name;
    protected  int  age;
    protected  String  species;

    public animal(String name, int age, String  species) {

        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void printCommands();

}