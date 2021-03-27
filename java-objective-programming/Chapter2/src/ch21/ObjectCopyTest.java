package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("title1", "author1");
		library[1] = new Book("title2", "author2");
		library[2] = new Book("title3", "author3");
		library[3] = new Book("title4", "author4");
		library[4] = new Book("title5", "author5");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("=== library ===");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("\n=== copy library ==="); //주소와 값 모두 같음 (shallowed copy, 얕은 복사)
//		for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		library[0].setAuthor("author1_1");
		library[0].setTitle("title1_1");
		
		System.out.println("=== library ===");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("\n=== copy library ==="); //복사한 객체배열도 값이 같이 바뀜
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
