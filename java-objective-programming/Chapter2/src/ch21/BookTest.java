package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]); //초기화 전: null
//		}
		
		library[0] = new Book("title1", "author1");
		library[1] = new Book("title2", "author2");
		library[2] = new Book("title3", "author3");
		library[3] = new Book("title4", "author4");
		library[4] = new Book("title5", "author5");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
