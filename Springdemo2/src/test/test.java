package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.animal;
public class test {
	public static void main(String[] args) {
		//创建Spring的上下文关系对象，加载上下文关系配置
		   ApplicationContext ctx=new ClassPathXmlApplicationContext("sd.xml");
		   animal a1=(animal)ctx.getBean("ssss");
		   a1.eat();
		  
		
	}

}
