package application;

import java.util.Date;

import entities.Order02;
import entities.enums.OrderStatus;

public class Program20 {

	public static void main(String[] args) {
		
		Order02 order = new Order02(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
