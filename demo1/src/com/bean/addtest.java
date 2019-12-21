package com.bean;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class addtest {
	public static void main(String[] args) {
		//数据库驱动加载
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//使用驱动管理器获取数据库连接
			java.sql.Connection con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/db", 
					"root", 
					"java");
			//使用连接获取SQL语句执行器对象
			Statement st=(Statement) con.createStatement();
		//	String sql="insert into student(sname,sex,birthday,stuid)values('张三','男','1990-1-1','1')";
			String sql="insert into student(sname,sex,address,birthday,classid) values('冷笑话','男','西安','1990-10-10',1)";
			int rows=st.executeUpdate(sql);
			if(rows>0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
