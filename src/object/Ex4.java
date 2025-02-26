package object;

class Book {
	int bookNumber;
	String bookTitle;

	public Book(int number, String title) {
		super();
		this.bookNumber = number;
		this.bookTitle = title;
	}


}


public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");

	
		System.out.println(book.toString()); 
		System.out.println(book); 
	
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		
	}
}
