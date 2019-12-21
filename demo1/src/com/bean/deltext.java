package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deltext {
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
		//4.执行增加表中数据的sql语句
		String sql="delete from student where stuid=3";
		int rows=st.executeUpdate(sql);
		if(rows>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		//关闭连接
		st.close();
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