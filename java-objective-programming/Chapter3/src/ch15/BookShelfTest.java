package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("title1");
		bookQueue.enQueue("title2");
		bookQueue.enQueue("title3");
		bookQueue.enQueue("title4");
		bookQueue.enQueue("title5");
		
		System.out.println(bookQueue.getSize());
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
		System.out.println(bookQueue.getSize());
	}
}
