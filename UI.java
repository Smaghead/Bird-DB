
import java.util.HashMap;
import java.util.Scanner;


public class UI {
    private Scanner scanner;
    private HashMap<String, Bird> birdList;
    private final String questionBird = "Bird?";

    public UI(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.birdList = new HashMap<>();
    }

    public void start() {
        String command;
        do {
            command = queryUser("?");
            switch (command) {
                case "Add":
                    addBird();
                    break;
                case "Observation":
                    addObservation();
                    break;
                case "All":
                    printAllBirds();
                    break;
                case "One":
                    printBird();
                    break;
                case "Quit":
                    break;
                default:
                    System.out.println("Unknown Command");
            }
        } 
        while (!command.equals("Quit"));
    }
    
    public void addBird() {
        String name = queryUser("Name:");
        String nameLatin = queryUser("Name in Latin:");
        Bird bird = new Bird(name, nameLatin);
        birdList.put(name, bird);
    }

    public void addObservation() {
        String birdSeen = queryUser("Bird?");
        if (birdList.containsKey(birdSeen)) {
            birdList.get(birdSeen).addObservation(birdSeen);
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAllBirds() {
        for (Bird printAll: birdList.values()) {
            System.out.println(printAll);
        }
    }
    
    public void printBird() {
        String birdToPrint = queryUser("Bird?");
        if (birdList.containsKey(birdToPrint)) {
            System.out.println(birdList.get(birdToPrint));;
        } else {
            System.out.println("Not a bird!");
        }
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public String queryUser(String question) {
        System.out.println(question);
        return readLine();
    }
}
