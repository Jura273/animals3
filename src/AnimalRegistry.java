import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {

    private Map<String, animal> animals;

    public AnimalRegistry() {

        this.animals = new HashMap<>();


    }

    public void addAnimal(String name, int age, String species) {

        animal animal;

        if (species.equalsIgnoreCase("dog")) {

            animal = new Dog(name, age);

        } else if (species.equalsIgnoreCase("cat")) {

            animal = new Cat(name, age);

        } else {
            System.out.println("unknown species");

            return;
        }

        animals.put(name, animal);

    }

    public void trainAnimal(String name, String command) {

        animal animal = animals.get(name);

        if (animal != null) {

            System.out.println("Training" + name + "to" + command);
            // Implement training logic for specific commands
        } else {

            System.out.println("Animal not found");

        }
    }

    public void printAnimalCommands(String name) {

        animal animal = animals.get(name);
        if (animal != null) {
            animal.printCommands();

        } else {

            System.out.println("Animal not found");

        }

    }

    public void printAnimalCount() {

        System.out.println("Total Animals:" + animals.size());

    }

    public void printAnimalsByAge() {

        // Implement sorting and printing animals by age

    }
}