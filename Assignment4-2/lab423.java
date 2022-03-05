import java.util.Scanner;

public class lab423 {
	public static void main(String[] args) {

		// 1) min and max
		// should be initialized with enough big or small value to be able to replaced
		// with any first input
		// or
		// initialized with the first input

		Scanner scnr = new Scanner(System.in);
		int Num;
		int max = 0;
		int min = 0;
		int total = 0;
		double average;
		int count = 0;
		int sum = 0;

		Num = scnr.nextInt();

		// add the below code
		// ----------------
		min = max = Num;
		// ----------------

		while (Num >= 0) {

			if (Num > max) {
				max = Num;
			}
			if (Num < min) {
				min = Num;
			}

			total += Num;
			++count;

			Num = scnr.nextInt();
		}

		// -----------------------------
		// Check the number of input.
		// if the number of input is less than or equal to 2
		// sum and avg should be 0
		// -----------------------------
		// Added Code
		if (count <= 2) {
			sum = 0;
			average = 0.0;
		} else {
			average = (total - max - min) / (double) (count - 2);
			sum = total - max - min;
		}
		// -----------------------------

		// average = (total - max - min) / (count - 2);
		// int sum = total - max - min;

		System.out.printf("%d %.2f", sum, average);
		scnr.close();
	}
}
