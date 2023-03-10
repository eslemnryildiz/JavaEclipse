import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		// mükemmel sayı : kendinden başka pozitif tüm tam bölenlerinin toplamı
		// kendisine eşit olan sayıdır. 6 --> 1,2,3

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int number = scan.nextInt();
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println("Mükemmel sayı");
		} else {
			System.out.println("Mükemmel sayı değil");
		}
	}

}
