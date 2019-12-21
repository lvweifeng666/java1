package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class chaxun {
public static void main(String[] args) {
	try {
		//1.数据库驱动加载
		Class.forName("com.mysql.jdbc.Driver");
		//2.使用驱动管理器类获取数据库连接
		Connection conn=DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/db", 
				"root", 
				"java");
		//3.获取语句执行器对象
		Statement st=conn.createStatement();
		//4.执行查询表中数据的sql语句
		String sql="select * from student";
		//5.接收查询的数据结果
		ResultSet rst=st.executeQuery(sql);
		//6.从结果集读取数据
		while (rst.next()) {
		System.out.println("编号："+rst.getInt(1));
		System.out.println("姓名："+rst.getString(2));
		System.out.println("性别："+rst.getString(3));	
		System.out.println("地址："+rst.getString(4));
		System.out.println("生日："+rst.getString(5));
		System.out.println("班级编号："+rst.getInt(6));
		}
		//关闭连接
		st.close();
		rst.close();
		conn.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
