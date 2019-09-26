import java.util.Scanner;

public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]>=arr[i])
            {
                continue;
            }
            else
            {
                count=i+1;
                break;
            }
        }
        
        return count;
        
	}
}
public class Main {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(CheckRotation.arrayRotateCheck(arr));
	}
}