package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//구현부는 있지만 구현내용이 없는 메소드 -> 자식 클래스에서 필요한 경우에 재정의해서 사용
	public void washCar() {}
	
	final public void run() {
		//아래 시나리오는 변하면 안됨 -> 메소드를 final 로 지정
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
