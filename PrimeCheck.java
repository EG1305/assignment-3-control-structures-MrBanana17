import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will tell you if a number is prime or not");
        System.out.println("You can enter 0 anytime to stop the program");
        while (true) {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();
            if (num == 0) break;
            boolean isPrime = num > 1;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(num + (isPrime ? " is prime" : " is not prime"));
        }
        scanner.close();
    }
}