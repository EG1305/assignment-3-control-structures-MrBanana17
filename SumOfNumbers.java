import java.util.Scanner;

class SumOfNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= num; i++) {
			    sum += i;
			}
			System.out.println("The sum of all numbers from 1 to " + num + " is " + sum);
		}
    }
}