package ch02;

public class VIPCustomer extends Customer {

	double salesRatio; //VIP 할인률
	private String agentID; //담당 상담원
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}
}
