package string;

public class Quiz3 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍 입문";
		
		int realLength = 0;
		for (int i = 0; i< str.length(); i++) {
			
			if(str.charAt(i )!= ' ') {
			realLength++;
			}

	}

		System.out.println(str.length());
		System.out.println(realLength);
	}
}
