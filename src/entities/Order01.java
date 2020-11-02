package entities;

import java.util.Date;

public class Order01 {
	private Date date;
	private Product01 product;
	
	public Order01(Date date, Product01 product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product01 getProduct() {
		return product;
	}
	public void setProduct(Product01 product) {
		this.product = product;
	}
	
}
