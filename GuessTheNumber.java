import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;
        int guess, attempts = 0;
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > random) System.out.println("Too high. Try again");
            else if (guess < random) System.out.println("Too low. Try again");
        } while (guess != random);
        System.out.println("Yes, the number is " + random);
        System.out.println("You guessed the correct number in " + attempts + " guesses");
        scanner.close();
    }
}