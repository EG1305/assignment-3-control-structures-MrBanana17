import java.util.Scanner;

class Mersenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int n = 1; (1 << n) - 1 < num; n++) {
            int mersenne = (1 << n) - 1;
            boolean isPrime = true;
            for (int j = 2; j * j <= mersenne; j++) {
                if (mersenne % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(mersenne + " ");
                count++;
            }
        }
        System.out.println("\nThere are a total of " + count + " Mersenne prime numbers");
        scanner.close();
    }
}