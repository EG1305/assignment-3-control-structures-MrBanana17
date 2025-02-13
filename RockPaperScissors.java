import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Random rand = new Random();
			System.out.println("Enter 0 (Scissors), 1 (Rock), or 2 (Paper):");
			int human = sc.nextInt();
			int computer = rand.nextInt(3);
			System.out.println("Computer chose: " + computer);
			if (human == computer) {
			    System.out.println("It's a tie!");
			} else if ((human == 0 && computer == 2) || (human == 1 && computer == 0) || (human == 2 && computer == 1)) {
			    System.out.println("You win!");
			} else {
			    System.out.println("You lose!");
			}
		}
    }
}