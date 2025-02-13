import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Random rand = new Random();
			System.out.println("How many digits do you want in your password?");
			int length = sc.nextInt();
			System.out.print("Your password is: ");
			for (int i = 0; i < length; i++) {
			    System.out.print(rand.nextInt(10) + " ");
			}
		}
    }
}