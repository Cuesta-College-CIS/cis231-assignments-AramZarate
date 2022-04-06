import java.util.Arrays;
import java.util.Scanner;

public class quiz121 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();

		for (int i = 0; i < CNT; i++) {
			minval = 0;
			minidx = -1;
			for (int j = i; j < N; j++) {
				if ((j == i) || (minval > numbers[j])) {
					minval = numbers[j];
					minidx = j;
				}
			}
			tmp = numbers[i];
			numbers[i] = numbers[minidx];
			numbers[minidx] = tmp;
			System.out.println(Arrays.toString(numbers));
		}

		scnr.close();
	}

}
