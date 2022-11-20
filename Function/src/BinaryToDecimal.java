import java.lang.Math;

public class BinaryToDecimal {
	public static int binaryToDecimal(int n) {
		int a = 0;
		int p = 0;
		while(n>0) {
			int lastdigit = n % 10;
			p = p + lastdigit * (int)Math.pow(2,a);
			n = n/10;
			a++;
		}
		System.out.println(p);
		return p;		
	}
	public static void main(String args[]) {
		int a = 101010;
		binaryToDecimal(a);
	}
}
