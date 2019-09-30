import java.util.Scanner;

public class Solution {
	public static String reverseWordWise(String input) {
		String str[]=input.split(" ");
        String ans="";
        for(int i=str.length-1;i>0;i--)
            ans+=str[i]+" ";
        ans+=str[0];
        return ans;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}
}
