import java.util.Random;
import java.util.Scanner;

class CoinToss {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Random rand = new Random();
			System.out.println("How many coin tosses?");
			int tosses = sc.nextInt();
			int heads = 0, tails = 0;
			for (int i = 0; i < tosses; i++) {
			    if (rand.nextBoolean()) {
			        System.out.println("Toss: Heads");
			        heads++;
			    } else {
			        System.out.println("Toss: Tails");
			        tails++;
			    }
			}
			System.out.println("Heads: " + heads + ", Tails: " + tails);
		}
    }
}
