package JavaArray;
import java.util.Scanner;

public class IlaganAirline {
    private static boolean[] seats = new boolean[10]; 
    private static final int FIRST_CLASS_LIMIT = 5;  
    private static final int ECONOMY_LIMIT = 10;     

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please book your flight");
        

        while (true) {
        	
            System.out.println("Choose 1: First Class or Choose 2: Economy:");
            int sectionChoice = scanner.nextInt();

            if (sectionChoice == 1) {
                if (!assignSeatInFirstClass()) {
                    System.out.println("First class is full. Would you like to be placed in Economy? (1 for Yes, 0 for No): ");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        if (!assignSeatInEconomy()) {
                            System.out.println("Economy is also full. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else if (sectionChoice == 2) {
                if (!assignSeatInEconomy()) {
                    System.out.println("Economy is full. Would you like to be placed in First Class? (1 for Yes, 0 for No): ");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        if (!assignSeatInFirstClass()) {
                            System.out.println("First class is also full. Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    
    public static boolean assignSeatInFirstClass() {
        for (int i = 0; i < FIRST_CLASS_LIMIT; i++) {
            if (!seats[i]) {
                seats[i] = true;  
                System.out.println("Boarding pass: Seat " + (i + 1) + " (First Class)");
                return true;
            }
        }
        return false;  
    }

    
    public static boolean assignSeatInEconomy() {
        for (int i = FIRST_CLASS_LIMIT; i < ECONOMY_LIMIT; i++) {
            if (!seats[i]) {
                seats[i] = true; 
                System.out.println("Boarding pass: Seat " + (i + 1) + " (Economy Class)");
                return true;
            }
        }
        return false;
    }
}
