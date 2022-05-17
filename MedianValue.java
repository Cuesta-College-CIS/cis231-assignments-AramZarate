import java.util.Scanner;

public class MedianValue {
    public static int[] createArray(int n) {
     // create an array
     int[] array = new int[n];
     //array with random integers between 0 and 99
     for (int i = 0; i < n; i++) {
      array[i] = (int) (Math.random() * 100);
     }
     // return the array
     return array;
    }
    public static int medianValue(int[] array) {
     int medianValue = 0;
     int size = array.length;
     int first = size / 2;
     if (size % 2 == 0) {
      medianValue = (array[first] + array[first - 1]) / 2;
     } else {
      medianValue = array[first];
     }
     return medianValue;
    }
    public static void printArray(int[] array) {
     for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
     }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
     int n = scnr.nextInt();
     
     if (n > 0) {
      int[] array = createArray(n);
      System.out.print("Array: ");
      printArray(array);
      System.out.println();
      System.out.println("The median value is " + medianValue(array));
     } 
     else {
      System.out.println("Invalid input");
     }
    }
    }