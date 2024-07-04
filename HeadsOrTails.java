import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
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
