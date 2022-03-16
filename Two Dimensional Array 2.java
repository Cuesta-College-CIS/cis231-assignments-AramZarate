import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        int sumRow, sumCol;  
        int rows = scnr.nextInt();
 		int cols = scnr.nextInt();
 		int rowmin=0;
		int rowmin_idx=0;
        int rowmax=0;
        int rowmax_idx=0;
        int colmin=0;
		int colmin_idx=0;
        int colmax=0;
        int colmax_idx=0;
          
       
        int a[][]  = new int[rows][cols];
        
            
            
          rows = a.length;  
        cols = a[0].length;  
          
          
        for(int i = 0; i < rows; i++){  
            sumRow = 0;  
            
            for(int j = 0; j < cols; j++){ 
                sumCol = 0;
                a[i][j] = scnr.nextInt();
              sumRow = sumRow + a[i][j];  
              if ((i == 0) || (rowmin > sumRow)) {
               rowmin = sumRow;
               rowmin_idx = i;
       }
       if ((i == 0) || (rowmax < sumRow)) {
               rowmax = sumRow;
               rowmax_idx = i;
       }
            }  
            
        }  
        System.out.println(Arrays.toString(a[rowmin_idx]));
			System.out.println(Arrays.toString(a[rowmax_idx]));
          
       
        for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){ 
              sumCol = sumCol + a[j][i];  
              if ((i == 0) || (colmin > sumCol)) {
               colmin = sumCol;
               colmin_idx = j;
       }
       if ((i == 0) || (colmax < sumCol)) {
               colmax = sumCol;
               colmax_idx = j;
       }
            }  
             
        }
        System.out.println(Arrays.toString(a[colmin_idx]));
			System.out.println(Arrays.toString(a[colmax_idx]));
    }  
}  
