package com.zhouxiang;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	volatile private List<String> products=new ArrayList<String>();

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}
	
   public boolean isEmpty(){
	   boolean flag=false;
	   if(products.isEmpty())
		   flag=true;
	   return flag;
   }
   public boolean isFull(){
	   boolean flag=false;
	   if(products.size()==10)
		   flag=true;
	   return flag;
   }
}
