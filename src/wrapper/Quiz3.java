package wrapper;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		
		
		for(int i = 0; i<list.size(); i++) {
			char ch = list.get(i);
			System.out.println(ch);
		}

	}

}
