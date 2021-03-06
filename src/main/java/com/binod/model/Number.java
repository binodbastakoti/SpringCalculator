package com.binod.model;

public class Number  {
	private String num1;
	private String num2;
	private String num3;
	private String num4;
	private String sum;
	private String products;

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getNum3() {
		return num3;
	}

	public void setNum3(String num3) {
		this.num3 = num3;
	}

	public String getNum4() {
		return num4;
	}

	public void setNum4(String num4) {
		this.num4 = num4;
	}

	public String getSum() {
		if (num1.equals("") || num2.equals(""))
			sum = "";
		else
			sum = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));

		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getProduct() {
		if (num3.equals("") || num4.equals(""))
			products = "";
		else
			products = String.valueOf(Integer.parseInt(num3) * Integer.parseInt(num4));

		return products;
	}

	public void setProduct(String product) {
		this.products = product;
	}
}

