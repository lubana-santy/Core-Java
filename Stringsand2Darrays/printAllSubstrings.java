import java.util.Scanner;

public class Solution {

	public static void printSubstrings(String str){
	
		char[] c=new char[str.length()];
        c=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            String print="";
            for(int j=i;j<str.length();j++)
            {
                print+=c[j];
                System.out.println(print);
            }
        }

	}
	

}
public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Solution.printSubstrings(str);
	}


}
