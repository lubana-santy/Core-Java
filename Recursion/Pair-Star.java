import java.util.Scanner;

public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        if(s.length()<=1)
            return s;
            if(s.charAt(0)==s.charAt(1))
                return s.charAt(0)+"*"+addStars(s.substring(1,s.length()));
            
                return s.charAt(0)+addStars(s.substring(1,s.length()));

	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.addStars(input));
	}
}
