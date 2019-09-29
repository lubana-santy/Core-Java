import java.util.Scanner;

public class Solution {

	public static String compress(String inputString) {
		String str="";
        char[] c=new char[inputString.length()];
        c=inputString.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!='\0')
            {
                str+=c[i];
                int count=1;
                for(int j=i+1;j<c.length;j++)
                {
                    if(c[i]==c[j])
                    {
                        count++;
                        c[j]='\0';
                    }
                    else
                    {
                        break;
                    }
                }
                if(count>1)
                    str+=count;
            }
        }
        return str;

	}

}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.compress(input));
	}
}
