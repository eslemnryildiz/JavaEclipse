import java.util.Scanner;

public class SayiBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int aranacak = scan.nextInt();
		boolean varMi = false;
		int[] sayilar = { 1, 2, 3, 5, 7, 8, 9, 0 };
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
