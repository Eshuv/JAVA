
public class CompressString {
	public static void compressString(String str) {
		int i = 0;
		StringBuilder temp = new StringBuilder(2*(str.length()));
		char ch;
		while(str.charAt(i) != 0) {
			ch = str.charAt(i);
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(ch != str.charAt(j)) {
//					temp.charAt(i) = ch;
//					temp.charAt(i+1) = count + '0'; 
					break;
				}
				count++;
			}
				temp.insert(i, ch);
				temp.insert(i+1, (count + '0')); 
		}
		System.out.println(temp);
	}
	public static void main(String args[]) {
		String str = "aaabbbbccccc";
		compressString(str);
	}
}
