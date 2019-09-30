import java.util.Scanner;

public class solution {

	public static void spiralPrint(int matrix[][]){
		
        int row=matrix.length;
        int col=matrix[0].length;
        
        int i, k = 0, m = 0;
        
  
        while (k < row && m < col) { 
           
            for (i = m; i < col; ++i) { 
                System.out.print(matrix[k][i] + " "); 
            } 
            k++; 
  
            for (i = k; i < row; ++i) { 
                System.out.print(matrix[i][col - 1] + " "); 
            } 
            col--; 
  
            if (k < row) { 
                for (i = col - 1; i >= m; --i) { 
                    System.out.print(matrix[row - 1][i] + " "); 
                } 
                row--; 
            } 
  
            if (m < col) { 
                for (i = row - 1; i >= k; --i) { 
                    System.out.print(matrix[i][m] + " "); 
                } 
                m++; 
            } 
        }
	}
}
public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int a[][] = takeInput2D();
		solution.spiralPrint(a);
	}
}