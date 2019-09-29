import java.util.Scanner;

public class Solution {

	
	public static void findLargest(int input[][]){
		
		int row=input.length;
        int col=input[0].length;
        int col_largest=Integer.MIN_VALUE;
        int row_largest=Integer.MIN_VALUE;
        int c=0;
        int r=0;
        for(int j=0;j<col;j++)
        {
            int sum=0;
            for(int i=0;i<row;i++)
                sum+=input[i][j];
            if(sum>col_largest)
            {
                col_largest=sum;
                c=j;
            }
                
        }
        for(int j=0;j<row;j++)
        {
            int sum=0;
            for(int i=0;i<col;i++)
                sum+=input[j][i];
            if(sum>row_largest)
            {
                row_largest=sum;
                r=j;
            }
                
        }        
        if(col_largest>row_largest)
            System.out.print("column "+c+" "+col_largest);
        else
            System.out.print("row "+r+" "+row_largest);


	}

	
}

public class Runner {
	
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
		Solution.findLargest(input);
		
	}

}
