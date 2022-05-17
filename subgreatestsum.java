import java.util.Scanner;
public class subgreatestsum {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
     int n = scnr.nextInt();
       int[] array = new int[n];
       for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random() * 100);
       }
       System.out.print("Array: ");
       printArray(array);
       System.out.println();
       System.out.print("Consecutive 3 numbers with the greatest sum: ");
       printArray(findMaxSum(array));
   }
   private static int[] findMaxSum(int[] array) {
       int maxSum = 0;
       int[] maxArray =  new int[0];
       for (int i = 0; i < array.length - 2; i++) {
           int sum = array[i] + array[i + 1] + array[i + 2];
           if (sum > maxSum) {
               maxSum = sum;
               maxArray = new int[]{array[i], array[i + 1], array[i + 2]};
           }
       }
       return maxArray;
   }
   
   private static void printArray(int[] array) {
       for (int i : array) {
           System.out.print(i + " ");
       }
   }
}