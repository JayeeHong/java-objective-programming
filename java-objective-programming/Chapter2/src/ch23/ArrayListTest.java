package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("title1", "author1"));
		library.add(new Book("title2", "author2"));
		library.add(new Book("title3", "author3"));
		library.add(new Book("title4", "author4"));
		library.add(new Book("title5", "author5"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
