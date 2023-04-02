
public class DisableBit {
	public static int disableBit(int num, int pos) {
		return (num &(~(1<<(pos-1))));
	}
	public static void main(String args[]) {
		int num = 5;
		System.out.println(disableBit(num, 1));
	}
}
