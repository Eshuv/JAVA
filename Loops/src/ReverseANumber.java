import java.util.*;

public class ReverseANumber {
	public static void main(String args[]) {
//		System.out.print("Enter a number");
		
		//Scanner sc = new Scanner(System.in);
		
		int n = 15701;
		int lastdigit = 0;
		
		while(n > 0) {
			lastdigit = n % 10;
			
			System.out.print(lastdigit);
			n /= 10;
		}
	}
}
