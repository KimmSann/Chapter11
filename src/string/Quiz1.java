package string;

public class Quiz1 {
	public static void main(String[] args) {
		
		String a = "a:b:c:d";
		String b = a.replace(":" , "#");
		System.out.println(b);
		
		String str = "안녕하세요 저는 둘리입니다.";
		System.out.println(str.indexOf("둘"));
		System.out.println(str.substring(9, 11));
	}

}
