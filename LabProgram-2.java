import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {

     Scanner scnr = new Scanner (System.in);
        int Num;
      int max = 0;
      int min = 0;
      int total = 0;
      double average;
      int count = 0;

      Num = scnr.nextInt();

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
      average = (total-max-min) / (count-2);
      int sum = total-max-min;

      System.out.printf("%d %.2f",sum,average);
   }
}