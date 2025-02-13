import java.util.Scanner;

class PINCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your PIN:");
			int pin = sc.nextInt();
			while (true) {
			    System.out.println("Confirm your PIN:");
			    int confirm = sc.nextInt();
			    if (confirm == pin) {
			        System.out.println("PIN accepted.");
			        break;
			    }
			    System.out.println("Incorrect PIN. Try again.");
			}
		}
    }
}