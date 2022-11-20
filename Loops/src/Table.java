import java.util.*;
public class Table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + "x" + i + "=" + n*i);
//			System.out.print("x");
//			System.out.print(i);
//			System.out.print("=");
//			System.out.println(n*i);
		}
	}
}
