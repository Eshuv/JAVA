
public class ToggleBit { // what is this class
	
	
	public static int toggleBit(int num, int pos) {
		return (num ^ (1 <<(pos-1)));
	}
	
	public static void main(String args[]) {
		int num = 5;
		System.out.println(toggleBit(num, 1));
		
	}
	
	
	
}
