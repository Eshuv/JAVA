
public class EvenOrOdd {
	public static boolean evenOrOdd(int num) {
		return ((num & 1) ? true: false);
	}
	public static void main(String args[]) {
		int num = 5;
		System.out.println(evenOrOdd(num));
		
	}
}
