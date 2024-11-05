package L14_Activity1;

import java.util.Scanner;

public class NutritionalInfoApp {

    public enum Fruit {
        APPLE, BANANA, ORANGE
    }

    public static void main(String[] args) {
        NutritionalInfoApp app = new NutritionalInfoApp();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fruit (apple, banana, orange): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            Fruit fruit = Fruit.valueOf(input);
            NutritionalInfo info = new NutritionalInfo(fruit);
            info.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid fruit entered. Please enter apple, banana, or orange.");
        } finally {
            scanner.close();
        }
    }

    private class NutritionalInfo {
        private Fruit fruit;

        public NutritionalInfo(Fruit fruit) {
            this.fruit = fruit;
        }

        public void displayInfo() {
            switch (fruit) {
                case Apple:
                    System.out.println("Apple: Calories 95, Vitamin C: 7.9 mg");
                    break;
                case Banana:
                    System.out.println("Banana: Calories 105, Vitamin C: 9.1 mg");
                    break;
                case Orange:
                    System.out.println("Orange: Calories 63, Vitamin C: 53.2 mg");
                    break;
                default:
                    System.out.println("No information available.");
            }
        }
    }
}

