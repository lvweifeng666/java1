package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class chaxun {
public static void main(String[] args) {
	try {
		//1.���ݿ���������
		Class.forName("com.mysql.jdbc.Driver");
		//2.ʹ���������������ȡ���ݿ�����
		Connection conn=DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/db", 
				"root", 
				"java");
		//3.��ȡ���ִ��������
		Statement st=conn.createStatement();
		//4.ִ�в�ѯ�������ݵ�sql���
		String sql="select * from student";
		//5.���ղ�ѯ�����ݽ��
		ResultSet rst=st.executeQuery(sql);
		//6.�ӽ������ȡ����
		while (rst.next()) {
		System.out.println("��ţ�"+rst.getInt(1));
		System.out.println("������"+rst.getString(2));
		System.out.println("�Ա�"+rst.getString(3));	
		System.out.println("��ַ��"+rst.getString(4));
		System.out.println("���գ�"+rst.getString(5));
		System.out.println("�༶��ţ�"+rst.getInt(6));
		}
		//�ر�����
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
