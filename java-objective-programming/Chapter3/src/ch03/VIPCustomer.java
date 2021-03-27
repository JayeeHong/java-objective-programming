package ch03;

public class VIPCustomer extends Customer {

	double salesRatio; //VIP 할인률
	private String agentID; //담당 상담원

	/*
	public VIPCustomer() {
		super(0, "no-name");
	
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	
	//상위 클래스에 기본생성자가 없을 때는 super 로 명시적으로 호출해줘야 함
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}
}
