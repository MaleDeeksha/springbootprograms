package com.example.demo;

public class Product {
private int productId;
private String productName;
private String productCategory;
private String productQuantity;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int productId, String productName, String productCategory, String productQuantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productQuantity = productQuantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(String productQuantity) {
	this.productQuantity = productQuantity;
}

}
