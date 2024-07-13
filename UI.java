
import java.util.ArrayList;
import java.util.Scanner;


public class UI {
    private Scanner scanner;
    private Bird bird;
    private ArrayList<Bird> birdList;
    
    public UI(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.birdList = new ArrayList<>();
    }
    
    public void start() {
        String command;
        do {
            System.out.println("?");
            command = scanner.nextLine();
            if (command.equals("Add")) {
                addBird();
            } else if (command.equals("Observation")) {
                addObservation();
            } else if (command.equals("All")) {
                printAllBirds();
            } else if (command.equals("One")) {
                printBird();
            }
        } 
        while (!command.equals("Quit"));
    }
    
    public void addBird() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String nameLatin = scanner.nextLine();
        Bird bird = new Bird(name, nameLatin);
        birdList.add(bird);
    }
    
    public void addObservation() {
        int counter = 0;
        System.out.println("Bird?");
        String birdSeen = scanner.nextLine();
        System.out.println(birdList);
        for (Bird toPrint: birdList) {
            if (toPrint.getName().equals(birdSeen)) {
                toPrint.addObservation(birdSeen);
                counter++;
            }
        }
        if (counter == 0) {
        System.out.println("Not a bird!");
        }
    }
    
    public void printAllBirds() {
        for (Bird printAll: birdList) {
            System.out.println(printAll.BirdtoString());
        }
    }
    
    public void printBird() {
        int counter = 0;
        System.out.println("Bird?");
        String birdToPrint = scanner.nextLine();
        for (Bird toPrint: birdList) {
            if (toPrint.getName().equals(birdToPrint)) {
                System.out.println(toPrint.BirdtoString());
                counter++;
            }
        }
        if (counter == 0) {
        System.out.println("Not a bird!");
        }
    }
}
