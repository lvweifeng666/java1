package com.biz;

public class Cat implements animal {
	public void eat() {
	System.out.println(cat+"��ϲ������");
	}
	
private String cat;
public String getCat() {
	System.out.println("getè���ڸ�ʲô");
	return cat;
}
public void setCat(String cat) {
	System.out.println("setè���ڸ�ʲô");
	this.cat = cat;
}
}
