import java.util.HashMap;

public class gg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="aaaaaaaaaaaa";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c:st.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		String st1="";
		for(char ch:hm.keySet())
			st1 = st1.concat(ch+hm.get(ch).toString());
		System.out.println(st1);
	}
	

}
