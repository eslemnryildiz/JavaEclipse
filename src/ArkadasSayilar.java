import java.util.Scanner;

public class ArkadasSayilar {

	public static void main(String[] args) {
		// arkadaş sayılar : kendileri hariç pozitif tam bölenleri toplamı diğerine eşit
		// sayılardır. 220-284
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz");
		int number1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		int number2 = scan.nextInt();
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				total2 = total2 + j;
			}

		}
		if (total1 == number2 && total2 == number1) {
			System.out.println("Arkadaş sayı");
		} else {
			System.out.println("Arkadaş sayı değil");
		}
	}

}
