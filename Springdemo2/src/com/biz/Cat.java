package com.biz;

public class Cat implements animal {
	public void eat() {
	System.out.println(cat+"很喜欢吃鱼");
	}
	
private String cat;
public String getCat() {
	System.out.println("get猫正在干什么");
	return cat;
}
public void setCat(String cat) {
	System.out.println("set猫正在干什么");
	this.cat = cat;
}
}
