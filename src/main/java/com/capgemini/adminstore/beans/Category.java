package com.capgemini.adminstore.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int categoryId;
@OneToMany(mappedBy="category",cascade=CascadeType.ALL)
private List<Product> products = new ArrayList<Product>();// one to many
private String categoryName;//Clothes, books, gadgets
private String type;		// shirts, pants, dresses in clothing
@ManyToOne
@JoinColumn(name="inventoryId")
private Inventory inventory;


public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Inventory getInventory() {
	return inventory;
}
public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
