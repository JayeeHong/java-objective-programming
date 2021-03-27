package ch19;

public class Car {

	private static int serialNum = 10000;
	
	int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public int getCarNum() {
		return carNum;
	}

}
