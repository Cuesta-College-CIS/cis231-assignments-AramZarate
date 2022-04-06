import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int tmp;
        int N = scnr.nextInt();
        int[] numbers = new int[N];
        int minidx = 0;
        int minval = Integer.MAX_VALUE;// finds min of array

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scnr.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (minval > numbers[i]) { // goes through whole array to find min
                minval = numbers[i];
                minidx = i;
            }
        }
        tmp = numbers[0];
        numbers[0] = numbers[minidx]; // sets temporary value for first value of array
        numbers[minidx] = tmp;// swaps values

        for (int i = 0; i < numbers.length; i++) { // prints array with swapped variables
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        minval = Integer.MAX_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (minval > numbers[i]) { // looks to find mn value after second value only
                minval = numbers[i];
                minidx = i;
            }
        }
        tmp = numbers[1]; // swaps variables with second value of array
        numbers[1] = numbers[minidx];
        numbers[minidx] = tmp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        minval = Integer.MAX_VALUE;
        for (int i = 2; i < numbers.length; i++) {
            if (minval > numbers[i]) {
                minval = numbers[i];
                minidx = i;
            }
        }
        tmp = numbers[2];
        numbers[2] = numbers[minidx];
        numbers[minidx] = tmp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        minval = Integer.MAX_VALUE;
        for (int i = 3; i < numbers.length; i++) {
            if (minval > numbers[i]) {
                minval = numbers[i];
                minidx = i;
            }
        }
        tmp = numbers[3];
        numbers[3] = numbers[minidx];
        numbers[minidx] = tmp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        minval = Integer.MAX_VALUE;
        for (int i = 4; i < numbers.length; i++) {
            if (minval > numbers[i]) {
                minval = numbers[i];
                minidx = i;
            }
        }
        tmp = numbers[4];
        numbers[4] = numbers[minidx];
        numbers[minidx] = tmp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
