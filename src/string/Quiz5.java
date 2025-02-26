package string;

import java.util.Scanner;


//  Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
//  문자열을 거꾸로 뒤집어서 출력하세요.
//
//  ex) "안녕하세요" -> "요세하녕안"

public class Quiz5 {

	public static void main(String[] args) {

		// 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); // 안녕하세요
		
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(0));

	}

}
