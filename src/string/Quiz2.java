package string;

public class Quiz2 {

	public static void main(String[] args) {
		String a = "881120-1068234";


		char gender = a.charAt(7);
		if(gender == '1' || gender == '3') {
			System.out.println("성별은 남자입니다.");
		}else if (gender == '2' || gender == '4') {
			System.out.println("성별은 여자입니다.");
		}else {
			System.out.println("잘못된 값입니다.");
		}
 
	}

}
