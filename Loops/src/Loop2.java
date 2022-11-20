import java.util.*;
public class Loop2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			n = sc.nextInt();
			if(n%10 == 0) {
				continue;
			}
			System.out.println(n);
		}
	}
}
