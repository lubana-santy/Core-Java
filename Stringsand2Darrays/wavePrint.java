import java.util.Scanner;

public class Solution {

	
	
	public static void wavePrint(int input[][]){
	    int row=input.length;
        int col=input[0].length;
        for(int i=0;i<col;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<row;j++)
                {
                    System.out.print(input[j][i]+" ");
                }
            }
            else
            {
                for(int j=row-1;j>=0;j--)
                {
                    System.out.print(input[j][i]+" ");
                }
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
	
		int input[][] = takeInput2D();
		Solution.wavePrint(input);
		
	}

}
