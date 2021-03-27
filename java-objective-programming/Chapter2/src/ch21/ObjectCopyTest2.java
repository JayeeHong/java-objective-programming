package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("title1", "author1");
		library[1] = new Book("title2", "author2");
		library[2] = new Book("title3", "author3");
		library[3] = new Book("title4", "author4");
		library[4] = new Book("title5", "author5");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		//값만 복사
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("author1_1");
		library[0].setTitle("title1_1");
		
		System.out.println("=== library ===");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("\n=== copy library ===");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
