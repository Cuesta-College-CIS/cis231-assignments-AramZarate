import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {

     Scanner scnr = new Scanner (System.in);
        int Num;
      int max = 0;
      int min = 0; // Min is initailzed 0
      int total = 0;
      double average;
      int count = 0;

      Num = scnr.nextInt();

      while (Num >= 0) {

         if (Num > max) {
            max = Num;
         }
         if (Num < min) {
            min = Num;     // Never changed if all values are greater than 0. Thus min is 0 even if there is no 0's in input. It causes an Error.
         }

         total += Num;
         ++count;

         Num = scnr.nextInt();
      }
      average = (total-max-min) / (count-2);   // dividend / dividor  all values are integers. Thus, result will be integer. Your average will be always truncated. 
      // You should use "type cast" before division operation.
      
      int sum = total-max-min;

      // System.out.printf("%d %.2f",sum,average);
      System.out.printf("%d %.2f\n",sum,average);
   }
}
