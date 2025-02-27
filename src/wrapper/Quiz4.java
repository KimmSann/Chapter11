package wrapper;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		
		String str2 = scanner.nextLine();
		
		
		int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
		
		System.out.println("두 수의 합은 : " + sum);

	}

}
