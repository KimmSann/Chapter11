package string;

public class Quiz4 {

	public static void main(String[] args) {
		
		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다"));

	}
	static int getCharCount(String s) {
		int realLength = 0;
		for(int i = 0; i< s.length(); i++) {
			if (s.charAt(i) != ' ') {
				realLength++;
			}
		}
		return realLength;
	}

}
