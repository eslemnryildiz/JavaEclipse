import java.util.Scanner;

public class SesliHarfler {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sesli harf giriniz");
		char harf = scan.nextLine().charAt(0);
		switch (harf) {
		case 'A':
		case 'O':
		case 'I':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Geçersiz harf");
		}
	}

}
