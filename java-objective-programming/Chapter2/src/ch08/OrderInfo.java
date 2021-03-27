package ch08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderInfo {

	public static void main(String[] args) {
		
		long curTime = System.currentTimeMillis();
		SimpleDateFormat timeFormat1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat timeFormat2 = new SimpleDateFormat("hhmmss");
		
		String str = timeFormat1.format(new Date(curTime));
		String str2 = timeFormat2.format(new Date(curTime));
		 
		String orderNumber = str + "0001";
		String phoneNumber = "010-1234-5678";
		String address = "서울시 강남구 역삼동";
		String orderDate = str;
		String orderTime = str2;
		int orderPrice = 35000;
		String menuNo = "0003";
		
		
		Order order = new Order(orderNumber, phoneNumber, address, orderDate, orderTime, orderPrice, menuNo);
		
		System.out.println(order.showOrderInfo());
	}

}
