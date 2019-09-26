import java.util.Scanner;

public class BinarySearch{	
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num){
		//write your code here
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]<num)
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
	}
}
public class Main {
	static Scanner s1 = new Scanner(System.in);
		
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
	}
}