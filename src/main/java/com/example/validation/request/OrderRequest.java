package com.example.validation.request;

import com.example.validation.valid.CheckPrice;

import javax.validation.constraints.Size;
import java.sql.Date;

public class OrderRequest {
	//	@NotBlank(message = "Không đc rỗng order")
	private String orderID;
	//@CheckPrice(message = "Lỗi lấy giá")
	private double price;

	@CheckPrice(message = "Không phải lỗi")
	private double price2;

	@Size(min = 0, max = 5, message = "Nhập type vượt quá giới hạn 0 - 5")
	private int type;
	private Date createdDate;


	@Size(min = 5, max = 10, message = "Nhập companyID vượt quá giới hạn 5-10")
	private int companyID;

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}
}
