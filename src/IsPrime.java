import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int number = scan.nextInt();
		boolean isPrime = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = true;
			}

		}
		if (isPrime == true) {
			System.out.println("Sayı asal değildir");
		} else {
			System.out.println("Sayı asaldır");
		}
	}

}
