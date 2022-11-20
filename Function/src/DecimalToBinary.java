import java.lang.Math;

public class DecimalToBinary {
	public static int decimalToBinary(int n) {
		int a = 0;
		int p = 0;
		while(n>0) {
			int lastdigit = n % 2;
			p = p + (lastdigit * (int)Math.pow(10,a));
			n = n/2;
			a++;
		}
		System.out.println(p);
		return p;		
	}
	public static void main(String args[]) {
		int a = 42;
		decimalToBinary(a);
	}
}
