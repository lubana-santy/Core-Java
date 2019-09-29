import java.util.Scanner;

public class Solution {

	public static int countWords(String str){
	
        int count=0;
        char[] c=new char[str.length()];
        c=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(c[i]==' ')
                count++;
            
        }
        return count+1;

	}
	

}
public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(Solution.countWords(str));
	}

}
