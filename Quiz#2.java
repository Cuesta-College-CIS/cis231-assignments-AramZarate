import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int matrix1[][]={{2, 5, 10},{3, 6, 9},{1, 2, 3}};  
        int matrix2[][]={{10, 20},{30, 40},{50, 60}};  
     int rowidx = scnr.nextInt();
 
    int c[][]=new int[3][2];  //creates result matrix
  
    for(int i=0;i<3;i++){  
        for(int j=0;j<2;j++){  
            c[i][j]=0;    
        for(int k=0;k<3;k++){    
            c[i][j]+=matrix1[i][k]*matrix2[k][j];    //multiplies each row with each other 
}
}
}  

for(int j = 0; j < c[rowidx].length ; j++){ //gets user input to print out specific row result
   System.out.print(c[rowidx][j]+" ");
}}}
