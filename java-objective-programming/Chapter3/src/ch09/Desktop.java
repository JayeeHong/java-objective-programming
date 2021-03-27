package ch09;

public class Desktop extends Computer {

	/**
	 * 추상메소드 구현
	 */
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	/**
	 * 추상메소드 구현
	 */
	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	/**
	 * 메소드 오버라이딩 (재구현)
	 */
	@Override
	public void turnOff() {
		System.out.println("Desktop turnoff");
	}

}
