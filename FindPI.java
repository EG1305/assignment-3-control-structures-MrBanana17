import java.util.Scanner;

class FindPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.print("How many iterations should we use? Please enter an integer: ");
        int iterations = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        double pi = 0;
        for (int i = 0; i < iterations; i++) {
            pi += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
        }
        pi *= 4;
        long endTime = System.currentTimeMillis();
        System.out.println("PI = " + pi);
        System.out.println("After " + iterations + " iterations.");
        System.out.println("This operation took " + (endTime - startTime) / 1000.0 + " seconds.");
        scanner.close();
    }
}