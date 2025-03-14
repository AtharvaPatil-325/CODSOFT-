import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Chances = 5;
        int finals = 0;
        boolean playAgain = true;

        System.out.println("Welcome!!");
        System.out.println("You Have about " + Chances + " chances to win the game");
        
        while (playAgain) {
            int rand = getrand(1, 100);
            boolean guess = false;

            for (int i = 0; i < Chances; i++) {
                System.out.println("Chance " + (i + 1) + ": Enter your Guess:");
                int user = sc.nextInt();

                if (user == rand) {
                    guess = true;
                    finals = 1;
                    System.out.println("You Won!!");
                    break;
                } else if (user > rand) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }

            if (!guess) {
                System.out.println("Sorry, you lost all chances. The number was: " + rand);
            }

            System.out.println("Do you want to play again? (Y/N)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("Y");
        }

        System.out.println("That's it! Hope you enjoyed it.");
        System.out.println("Here is your Score: " + finals);
        
        sc.close(); // Close Scanner
    }

    public static int getrand(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
