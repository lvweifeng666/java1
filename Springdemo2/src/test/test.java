package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.animal;
public class test {
	public static void main(String[] args) {
		//����Spring�������Ĺ�ϵ���󣬼��������Ĺ�ϵ����
		   ApplicationContext ctx=new ClassPathXmlApplicationContext("sd.xml");
		   animal a1=(animal)ctx.getBean("ssss");
		   a1.eat();
		  
		
	}

}
