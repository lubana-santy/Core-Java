import java.util.Scanner;

public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		char[] c=new char[input.length()];
        c=input.toCharArray();
        String str="";
        int count=0,space=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=' ')
            {
                count++;
            }
            else
            {
               
                for(int j=count-1;j>=0;j--)
                    str+=c[space+j];
                str+=" ";
                space+=count+1;
                count=0;
            }
         }
        for(int j=count-1;j>=0;j--)
            str+=c[space+j];
        return str;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseEachWord(input));
	}
}
