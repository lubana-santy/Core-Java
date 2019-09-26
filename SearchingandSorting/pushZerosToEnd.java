import java.util.Scanner;

public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
		
        int zeros=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]!=0)
                {
                    arr[zeros]=arr[i];
                    zeros++;
                }
            
        }
        for(int i=zeros;i<arr.length;i++)
        {
            arr[i]=0;
        }

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

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		PushZerosAtEnd.pushZerosAtEnd(arr);
		print(arr);
	}
}