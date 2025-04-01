package jpa01;

import java.io.*;

//step 1 : implement java.is.serializable interface
public class BookBean implements Serializable{

	//step 2: declare all variable as private access modifier
	@SuppressWarnings("serial")
	private String code ,name ,author;
	private float price;
	private int qty;
	
	//step 3 : create default 0-argument,0-parameter constructor
	public BookBean() {}
	
	//step 4 : create setter and getter method for all private variables
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
