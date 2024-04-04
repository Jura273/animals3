import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnimalRegistry animalRegistry = new AnimalRegistry();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add Animal");

            System.out.println("2. Train Animal");

            System.out.println("3. Print Animal Commands");

            System.out.println("4. Print Animal Count");

            System.out.println("5. Print Animal By Age");

            System.out.println("6. Exit");

            System.out.println("Enter your choice:  ");

            int choice = scanner.nextInt();

            scanner.nextLine();  //Consume the newline

            switch (choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter species (Dog or Cat): ");
                    String species = scanner.nextLine();
                    animalRegistry.addAnimal(name, age, species);
                    break;

                case 2:

                    System.out.print("Enter name of the animal.java to train: ");
                    String trainName = scanner.nextLine();
                    System.out.print("Enter command to train: ");
                    String command = scanner.nextLine();
                    animalRegistry.trainAnimal(trainName, command);
                    break;

                case 3:

                    System.out.print("Enter name of the animal.java to print commands: ");
                    String printCommandName = scanner.nextLine();
                    animalRegistry.printAnimalCommands(printCommandName);
                    break;

                case 4:

                    animalRegistry.printAnimalCount();
                    break;

                case 5:

                    animalRegistry.printAnimalsByAge();
                    break;

                case 6:

                    System.out.println("Exiting program.");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice. Please try again.");




            }
        }

    }

}
