package com.jsp.shopping;

import com.jsp.account.Account;
import com.jsp.debitcard.Debitcard;

public class Shopping extends Debitcard{
	String productName;
	double productprice;
	String shippingaddress;
	public Shopping(String productName,double productprice,String shippingadress) {
		this.productName=productName;
		this.productprice=productprice;
		this.shippingaddress=shippingaddress;
	}
	public void selectproduct(String productName, double productprice,String shippingaddress) {
		if(this.productName==(shippingaddress) && this.productprice==(productprice) );
	}

}
