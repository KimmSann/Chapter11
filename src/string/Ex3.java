package string;

public class Ex3 {

	public static void main(String[] args) {
		
		
		String str = "java";
		System.out.println(str.hashCode());
		str = str+"and";
		System.out.println(str.hashCode());
		str = str + "android";
		System.out.println(str.hashCode());
		
		StringBuilder builder = new StringBuilder("java");
		System.out.println(builder.hashCode());
		
		builder.append("and");
		System.out.println(builder.hashCode());
		builder.append("android");
		System.out.println(builder.hashCode());
		System.out.println(builder);
		

	}

}
