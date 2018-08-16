package com.capgemini.adminstore.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coupon {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int couponId;
	private Date couponStartDate;
	private Date couponEndDate;
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="productId")
	private int productId;//one to one
*/	private String couponName;
	private double couponDiscountValue;
	@ManyToOne
	@JoinColumn(name="adminId")
	private Admin admin;
	
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public Date getCouponStartDate() {
		return couponStartDate;
	}
	public void setCouponStartDate(Date couponStartDate) {
		this.couponStartDate = couponStartDate;
	}
	public Date getCouponEndDate() {
		return couponEndDate;
	}
	public void setCouponEndDate(Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}
	/*public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}*/
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public double getCouponDiscountValue() {
		return couponDiscountValue;
	}
	public void setCouponDiscountValue(double couponDiscountValue) {
		this.couponDiscountValue = couponDiscountValue;
	}
	
	
}
