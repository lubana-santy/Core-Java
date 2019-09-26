import java.util.Scanner;

public class InsertionSort {	
	//arr is the input array you have to sort
	public static void insertionSort(int[] arr){
		
        for(int i=1;i<arr.length;++i)
        {
            int key=arr[i];
            int j=i-1;
            while( j>=0 && arr[j] > key)
            {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=key;
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
		InsertionSort.insertionSort(arr);
		print(arr);
	}
}