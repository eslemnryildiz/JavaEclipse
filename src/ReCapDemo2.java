
public class ReCapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 3.7, 6.1, 8.8 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Sayıların toplamı : " + total);
		System.out.println("En büyük sayı : " + max);
	}

}
