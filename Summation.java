import java.util.Scanner;

class Summation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int sum = 0;
			while (true) {
			    System.out.println("Enter a number (0 to stop):");
			    int num = sc.nextInt();
			    if (num == 0) break;
			    sum += num;
			    System.out.println("Sum so far: " + sum);
			}
			System.out.println("Final sum: " + sum);
		}
    }
}