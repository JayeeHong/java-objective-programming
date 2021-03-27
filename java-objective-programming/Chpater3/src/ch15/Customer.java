package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell()");
	}

	@Override
	public void buy() {
		System.out.println("Customer buy()");
	}

	//중복되는 클래스는 사용하는 쪽에서 재구현해야 한다.
	@Override
	public void order() {
		System.out.println("Customer order()");
	}
	
	public void hello() {
		System.out.println("Customer hello()");
	}
	
}
