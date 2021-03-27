package ch08;

public class Order {
	
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String menuNo;
	
	public Order(String orderNumber, String phoneNumber, String address, String orderDate, String orderTime, int orderPrice, String menuNo) {
		
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNo = menuNo;
	}
	
	public String showOrderInfo() {
		String orderInfo = "";
		
		orderInfo += "주문 접수 번호 : " + orderNumber + "\n";
		orderInfo += "주문 핸드폰 번호 : " + phoneNumber + "\n";
		orderInfo += "주문 집 주소 : " + address + "\n";
		orderInfo += "주문 날짜 : " + orderDate + "\n";
		orderInfo += "주문 시간 : " + orderTime + "\n";
		orderInfo += "주문 가격 : " + orderPrice + "\n";
		orderInfo += "메뉴 번호 : " + menuNo + "\n";
		
		return orderInfo;
	}

}











