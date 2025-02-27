package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문장을 입력하세요 : ");
			String line = sc.nextLine();
			
			
			if (line.equals("end") || line.equals("END")) {
				break;
				
			}
			if (line.toLowerCase().equals("end")) {
				break;
			}
			if (line.equalsIgnoreCase("end")) {
				break;
			}
			
		}

	}

}
