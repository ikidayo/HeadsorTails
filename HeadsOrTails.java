import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who are you? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        String[] outcomes = {"Heads", "Tails"};
        Random random = new Random();
        
        System.out.println("Tossing a coin...");

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= 3; i++) {
            String result = outcomes[random.nextInt(outcomes.length)];
            System.out.println("Round " + i + ": " + result);
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}

