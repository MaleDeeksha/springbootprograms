package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	private static Map<Integer, Product>mapproduct=new HashMap();
	private static int index=2;
	static {
		Product p1=new Product(1, "santhoor", "soap", "2");
		Product p2=new Product(2, "bhadham", "dry foot", "2");

		mapproduct.put(1, p1);
		mapproduct.put(2, p2);
	}
	public static List<Product>getProductDetails(){
		return new ArrayList<>(mapproduct.values());
	}
	public static Product getProductDetailsById(int productId) {
		return mapproduct.get(productId);
	}
	public static Product addProductDetails(Product pr) {
	index+=1;
		pr.setProductId(index);
		mapproduct.put(index,pr);
		return pr;
	}
	public static Product removeProductDetailsById(int productId) {
		return mapproduct.remove(productId);
	}
	public static Product update(int productId,Product pr) {
	//dex+=1;
		pr.setProductId(productId);
		mapproduct.put(productId,pr);
		return pr;
	}

}
