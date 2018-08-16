package com.capgemini.adminstore.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Discount {
	
private Date startDateOfDiscount;
private Date endDateOfDiscount;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="productId")
private Product product;//one to one
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int discountId;
private int percentDiscount;
@ManyToOne
@JoinColumn(name="adminId")
private Admin admin;

public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Date getStartDateOfDiscount() {
	return startDateOfDiscount;
}
public void setStartDateOfDiscount(Date startDateOfDiscount) {
	this.startDateOfDiscount = startDateOfDiscount;
}
public Date getEndDateOfDiscount() {
	return endDateOfDiscount;
}
public void setEndDateOfDiscount(Date endDateOfDiscount) {
	this.endDateOfDiscount = endDateOfDiscount;
}
public int getDiscountId() {
	return discountId;
}
public void setDiscountId(int discountId) {
	this.discountId = discountId;
}
public double getPercentDiscount() {
	return percentDiscount;
}
public void setPercentDiscount(int percentDiscount) {
	this.percentDiscount = percentDiscount;
}



}
