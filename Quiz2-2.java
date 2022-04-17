import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
    public static int N;
   public static int greaterValue = 0;
   
   public static int[] constructArray() {
       //takes user input N for array size 
       //loop to create array out of random numbers 1-99
       //returns array for when called
       int[] array = new int[N];
       Random random = new Random();
       for (int i = 0; i<N; i++)
           array[i] = random.nextInt(100);
       return array;
       
   }

   public static void printArray(int[] array) {
       //loop to print out contructed arrays
        for (int i = 0; i<N; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

   public static int findMoreEvens(int[] n1, int[] n2) {
       //loop to count numbers of even numbers in each array by checking if no remainder when divided by 2 
       //using "a1" and "a2" to count number of even numbers 
       int a1 = 0, a2 = 0;
       for (int x: n1){
           if(x%2==0)
               a1++;
       }
       for (int x: n2){
           if(x%2==0)
               a2++;
       }
       if (a1>a2){
           return 1;
       }
       else
           return 2;
       
   }


   public static int findGreatest(int[] n1, int[] n2) {
       //loop to check the greatest value in first array then making that value the greatest and after checking next array based off the greatest value off of array1
       //if condtion is true then number of array is returned
       int arrayNumber;
       for (int x: n1)
           if(x>greaterValue)
               greaterValue = x;
                arrayNumber = 1;

       for (int x: n2)
           if(x>greaterValue) {
               greaterValue = x;
               arrayNumber = 2;
           }
       return arrayNumber;
   }

   public static void main(String[] args) {

       // create arrays
       Scanner scanner = new Scanner(System.in);
       N = scanner.nextInt();
       int[] array1 = constructArray();
       int[] array2 = constructArray();

       // print arrays
       System.out.println("Array 1 values:");
       printArray(array1);
       System.out.println("Array 2 values:");
       printArray(array2);

       // find most even numbers in array
       System.out.println("Array " + findMoreEvens(array1, array2) + " has more even numbers");

       // find the greatest value in array
       System.out.println("Array " + findGreatest(array1, array2) + " has the greatest value " + greaterValue + ".");
   }


}
