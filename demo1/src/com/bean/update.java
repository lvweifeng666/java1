package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
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
		//Statement st=conn.createStatement();
		//4.ִ���޸ı������ݵ�sql���
		String sql="update student set sname=?,sex=?,address=?,birthday=?,classid=? where stuid=?";
		//5.Ԥִ��������
		PreparedStatement ps=conn.prepareStatement(sql);
		//5_1���ò���
		ps.setString(1, "����");
		ps.setString(2, "Ů");
		ps.setString(3, "����");
		ps.setString(4, "1998-10-10");
		ps.setInt(5, 2);
		ps.setInt(6, 1);
		//ִ��
		int rows=ps.executeUpdate();
		if(rows>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
		//�ر�����
		
		ps.close();
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
