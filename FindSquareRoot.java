import java.util.Scanner;

class FindSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program will find the square root of a number");
        System.out.print("Enter a positive integer: ");
        double n = scanner.nextDouble();
        double lastGuess = 1, nextGuess;
        int iterations = 0;
        do {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            iterations++;
            if (Math.abs(nextGuess - lastGuess) < 0.000001) break;
            lastGuess = nextGuess;
        } while (true);
        System.out.println("The square root of " + n + " is " + nextGuess);
        System.out.println("The program found the result in " + iterations + " iterations");
        scanner.close();
    }
}