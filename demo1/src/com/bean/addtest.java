package com.bean;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class addtest {
	public static void main(String[] args) {
		//���ݿ���������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//ʹ��������������ȡ���ݿ�����
			java.sql.Connection con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/db", 
					"root", 
					"java");
			//ʹ�����ӻ�ȡSQL���ִ��������
			Statement st=(Statement) con.createStatement();
		//	String sql="insert into student(sname,sex,birthday,stuid)values('����','��','1990-1-1','1')";
			String sql="insert into student(sname,sex,address,birthday,classid) values('��Ц��','��','����','1990-10-10',1)";
			int rows=st.executeUpdate(sql);
			if(rows>0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
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
