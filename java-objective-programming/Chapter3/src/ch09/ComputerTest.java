package ch09;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer computer = new Computer(); //추상 메소드는 인스턴스 생성 불가
		
		Computer desktop = new Desktop();
		desktop.display();
		
		NoteBook notebook = new MyNoteBook();
		notebook.typing();
		notebook.display();
	}
}
