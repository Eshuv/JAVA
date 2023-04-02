import java.util.*;
public class ShortestPath {
	public static void shortestPath(String str) {
		int a = 0;
		int b = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'N') {
				b++;
			}
			else if(str.charAt(i)== 'S') {
				b--;
			}
			else if(str.charAt(i) == 'E') {
				a++;
			}
			else {
				a--;
			}
		}
		System.out.println(Math.sqrt((a*a) + (b*b)));
	}
	public static void main(String args[]) {
		String str  = "WEEWNNSWE";
		
		shortestPath(str);
	}
}
